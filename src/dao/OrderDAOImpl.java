package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import converter.OrderConverter;
import dbUtility.Connector;
import model.Order;

public class OrderDAOImpl implements OrderDAO{

	private DBCollection collection;
	public OrderDAOImpl(){
		this.collection = Connector.database.getCollection("Order");
	}
	
	@Override
	public Order insertOrder(Order order) {
		DBObject obj = OrderConverter.toDBObject(order);
		this.collection.insert(obj);
		ObjectId id = (ObjectId) obj.get("_id");
		order.setId((String) id.toString());
		return order;
	}

	@Override
	public void updateOrder(Order order) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(order.getId()));
		this.collection.update(query, OrderConverter.toDBObject(order));
	}

	@Override
	public void deleteOrder(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		this.collection.remove(query);
	}

	@Override
	public Order getOrder(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		DBObject obj = this.collection.findOne(query);
		return OrderConverter.toOrder(obj);
	}

	@Override
	public List<Order> getAllOrder() {
		List<Order> list = new ArrayList<Order>();
		DBCursor cursor = this.collection.find();
		while (cursor.hasNext()){
			DBObject obj = cursor.next();
			Order order = OrderConverter.toOrder(obj);
			list.add(order);
		}
		return list;
	}
	
}
