package dao;

import java.util.List;

import model.Discount;
import model.Product;

public interface DiscountDAO {
	public Discount insertDiscount(Discount discount);
	public void updateDiscount(Discount discount);
	public void deleteDiscount(String id);
	public Discount getDiscount(String id);
	public List<Product> getAllDiscount();
	public int checkDiscount(String id);
}