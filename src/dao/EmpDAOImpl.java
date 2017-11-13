package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import model.Employee;
import model.Product;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import converter.EmployeeConverter;
import converter.ProductConverter;
import dbUtility.Connector;

public class EmpDAOImpl implements EmpDAO{

	private DBCollection collection;
	public EmpDAOImpl(){
		this.collection = Connector.database.getCollection("Employee");
	}
	
	@Override
	public Employee insertUser(Employee employee) {
		DBObject obj = EmployeeConverter.toDBObject(employee);
		this.collection.insert(obj);
		ObjectId id = (ObjectId) obj.get("_id");
		employee.setId((String) id.toString());
		return employee;
	}

	@Override
	public void updateUser(Employee employee) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(employee.getId()));
		this.collection.update(query, EmployeeConverter.toDBObject(employee));
	}

	@Override
	public void deleteUser(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		this.collection.remove(query);
	}

	@Override
	public Employee getUser(String id) {
		DBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		DBObject obj = this.collection.findOne(query);
		return EmployeeConverter.toEmployee(obj);
	}

	@Override
	public List<Employee> getAllUser() {
		List<Employee> list = new ArrayList<Employee>();
		DBCursor cursor = this.collection.find();
		while (cursor.hasNext()){
			DBObject obj = cursor.next();
			Employee employee = EmployeeConverter.toEmployee(obj);
			list.add(employee);
		}
		return list;
	}

	@Override
	public DBObject authenticate(String username, String password) {
		DBObject query = new BasicDBObject();
		query.put("username", username);
		query.put("password", password);
		return this.collection.findOne(query);
	}
	
}
