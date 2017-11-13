package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.Employee;

public class EmployeeConverter {
	public static DBObject toDBObject(Employee employee){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("salary", employee.getSalary());
		if(employee.getId() != null){
			builder = builder.append("_id", new ObjectId(employee.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Employee toEmployee(DBObject obj){
		Employee employee = new Employee();
		employee.setId(String.valueOf(obj.get("_id")));
		employee.setSalary(Integer.parseInt(String.valueOf(obj.get("salary"))));
		return employee;
	}
}
