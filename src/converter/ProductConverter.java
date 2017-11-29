package converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

import model.Product;

public class ProductConverter {
	public static DBObject toDBObject(Product product){
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("name", product.getName())
				.append("color", product.getColor())
				.append("size", product.getSize())
				.append("amount", product.getAmount())
				.append("price", product.getPrice())
				.append("discount", product.getDiscount())
				.append("adder", product.getAdder());
		if(product.getId() != null){
			builder = builder.append("_id", new ObjectId(product.getId())); //_id is primary key in mongoDB
		}
		return builder.get();
	}
	public static Product toProduct(DBObject obj){
		Product product = new Product();
		product.setId(String.valueOf(obj.get("_id")));
		product.setName(String.valueOf(obj.get("name")));
		product.setColor(String.valueOf(obj.get("color")));
		product.setSize(Integer.parseInt(String.valueOf(obj.get("size"))));
		product.setAmount(Integer.parseInt(String.valueOf(obj.get("amount"))));
		product.setPrice(Integer.parseInt(String.valueOf(obj.get("price"))));
		product.setDiscount(Integer.parseInt(String.valueOf(obj.get("discount"))));
//		product.setAdder(obj.get("adder"));
		return product;
	}
}
