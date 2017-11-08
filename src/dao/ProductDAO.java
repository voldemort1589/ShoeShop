package dao;

import java.util.List;

import model.Product;

public interface ProductDAO {
	public Product insertProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(String id);
	public Product getProduct(String id);
	public List<Product> getAllProduct();
}
