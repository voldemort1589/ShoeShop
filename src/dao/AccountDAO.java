package dao;

import com.mongodb.DBObject;

import model.Account;

public interface AccountDAO {
	public Account insertAccount(Account account);
	public void updateAccount(Account account);
	public void deleteAccount(String id);
	public Account getAccount(String id);
	public DBObject authenticate(String username, String password);
}
