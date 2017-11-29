package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Account;
import model.Product;	
import dao.ProductDAOImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/Product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDAOImpl productDAO;
	
	public ProductController() {
		super();
		this.productDAO = new ProductDAOImpl();
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
//		if(request.getSession().getAttribute("userSession") == null) {
//			response.sendRedirect(request.getContextPath() + "/EmpLogin");
//			return;
//		}
		
		String action = request.getParameter("action");
		if (action != null) {
			switch(action) {
				case "add":
					request.getRequestDispatcher("/view/admin/product/add.jsp").forward(request, response);
					break;
				case "edit":
//					User user = this.userDAO.getUser(request.getParameter("id"));
//					request.setAttribute("user", user);
//					request.getRequestDispatcher("/view/user/editUser.jsp").forward(request, response);
					break;
				case "delete":
					this.productDAO.deleteProduct(request.getParameter("id"));
					List<Product> products = this.productDAO.getAllProduct();
					request.setAttribute("listProducts", products);
					response.sendRedirect(request.getContextPath() + "/Product");
					break;
			}	
		} else {
			List<Product> products = this.productDAO.getAllProduct();
			request.setAttribute("listProducts", products);
			request.getRequestDispatcher("/view/admin/product/list.jsp").forward(request, response);
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		Product product = new Product();
		product.setAdder((Account) request.getSession().getAttribute("userSession"));
		product.setAmount(Integer.parseInt(request.getParameter("amount")));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setSize(Integer.parseInt(request.getParameter("size")));
		product.setName(request.getParameter("name"));
		product.setColor(request.getParameter("color"));
		if (product.getId() == null) {
			this.productDAO.insertProduct(product);
		} else {
			this.productDAO.updateProduct(product);
		}
		doGet(request, response);
	}
}

