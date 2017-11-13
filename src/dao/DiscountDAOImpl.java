package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import converter.DiscountConverter;
import converter.UserConverter;
import dbUtility.Connector;
import model.Discount;
import model.Product;
import model.User;

public class DiscountDAOImpl implements DiscountDAO {

	private DBCollection collection;
	public DiscountDAOImpl(){
		this.collection = Connector.database.getCollection("Discount");
	}
	
	@Override
	public Discount insertDiscount(Discount discount) {
		DBObject obj = DiscountConverter.toDBObject(discount);
		this.collection.insert(obj);
		ObjectId id = (ObjectId) obj.get("_id");
		discount.setId((String) id.toString());
		return discount;
	}

	@Override
	public void updateDiscount(Discount discount) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(discount.getId()));
		this.collection.update(query, DiscountConverter.toDBObject(discount));
	}

	@Override
	public void deleteDiscount(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		this.collection.remove(query);
	}

	@Override
	public Discount getDiscount(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		DBObject obj = this.collection.findOne(query);
		return DiscountConverter.toDiscount(obj);
	}

	@Override
	public List<Discount> getAllDiscount() {
		List<Discount> list = new ArrayList<Discount>();
		DBCursor cursor = this.collection.find();
		while (cursor.hasNext()){
			DBObject obj = cursor.next();
			Discount discount = DiscountConverter.toDiscount(obj);
			list.add(discount);
		}
		return list;
	}

	@Override
	public int checkDiscount(String id) {
		DBObject query = new BasicDBObject();
		query.put("product", id);
		return Integer.parseInt(String.valueOf(this.collection.findOne(query)));
	}
}