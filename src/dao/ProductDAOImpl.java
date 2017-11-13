package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import converter.ProductConverter;
import dbUtility.Connector;
import model.Product;

public class ProductDAOImpl implements ProductDAO{

	private DBCollection collection;
	public ProductDAOImpl(){
		this.collection = Connector.database.getCollection("Product");
	}
	
	@Override
	public Product insertProduct(Product product) {
		DBObject obj = ProductConverter.toDBObject(product);
		this.collection.insert(obj);
		ObjectId id = (ObjectId) obj.get("_id");
		product.setId((String) id.toString());
		return product;
	}

	@Override
	public void updateProduct(Product product) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(product.getId()));
		this.collection.update(query, ProductConverter.toDBObject(product));
		
	}

	@Override
	public void deleteProduct(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		this.collection.remove(query);
		
	}

	@Override
	public Product getProduct(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		DBObject obj = this.collection.findOne(query);
		return ProductConverter.toProduct(obj);
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<Product>();
		DBCursor cursor = this.collection.find();
		while (cursor.hasNext()){
			DBObject obj = cursor.next();
			Product product = ProductConverter.toProduct(obj);
			list.add(product);
		}
		return list;
	}
	
}