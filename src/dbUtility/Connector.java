package dbUtility;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Connector {
	public static DB database;
	static {
		try{
			MongoClient client = new MongoClient("localhost", 27017);
			database = client.getDB("DB");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
