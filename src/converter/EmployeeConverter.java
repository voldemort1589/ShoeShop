package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.Employee;

public class EmployeeConverter {
	public static DBObject toDBObject(Employee employee){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("name", employee.getName())
				.append("username", employee.getUsername())
				.append("password", employee.getPassword())
				.append("email", employee.getEmail())
				.append("phone", employee.getPhone())
				.append("salary", employee.getSalary());
		if(employee.getId() != null){
			builder = builder.append("_id", new ObjectId(employee.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Employee toEmployee(DBObject obj){
		Employee employee = new Employee();
		employee.setId(String.valueOf(obj.get("_id")));
		employee.setName(String.valueOf(obj.get("name")));
		employee.setUsername(String.valueOf(obj.get("username")));
		employee.setPassword(String.valueOf(obj.get("password")));
		employee.setEmail(String.valueOf(obj.get("email")));
		employee.setPhone(String.valueOf(obj.get("phone")));
		employee.setSalary(Integer.parseInt(String.valueOf(obj.get("salary"))));
		return employee;
	}
}
