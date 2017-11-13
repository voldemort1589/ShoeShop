package dao;

import java.util.List;

import model.Payment;

public interface PaymentDAO {
	public Payment insertPayment(Payment payment);
	public void updatePayment(Payment payment);
	public void deletePayment(String id);
	public Payment getPayment(String id);
	public List<Payment> getAllPayment();
}