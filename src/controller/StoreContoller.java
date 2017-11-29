package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import model.Customer;
import model.Product;
import model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/Store")
public class StoreContoller extends HttpServlet {
	private ProductDAO productDAO;
	
	public StoreContoller() {
		super();
		this.productDAO = new ProductDAOImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
//		if(request.getSession().getAttribute("userSession") == null) {
//			response.sendRedirect(request.getContextPath() + "/EmpLogin");
//			return;
//		}
		
		String action = request.getParameter("action");
		if (action != null) {
			switch(action) {
				case "show":
					request.getRequestDispatcher("/view/user/product.jsp").forward(request, response);
					break;
			}	
		} else {
			List<Product> products = this.productDAO.getAllProduct();
			Customer user = (Customer) request.getSession().getAttribute("userSession");
			request.setAttribute("listProducts", products);
			request.setAttribute("user", user);
			request.getRequestDispatcher("/view/user/store.jsp").forward(request, response);
		}
	}
	
}
