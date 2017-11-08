package dao;

import java.util.List;

import model.Discount;

public interface DiscountDAO {
	public Discount insertDiscount(Discount discount);
	public void updateDiscount(Discount discount);
	public void deleteDiscount(String id);
	public Discount getDiscount(String id);
	public List<Discount> getAllDiscount();
}
