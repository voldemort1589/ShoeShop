package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CusDAO;
import dao.CusDAOImpl;
import model.Customer;
import model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/Customer")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CusDAO cusDAO;

	public CustomerController() {
		super();
		this.cusDAO = new CusDAOImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String action = request.getParameter("action");
		if (action != null && action.equalsIgnoreCase("add")) {
			request.getRequestDispatcher("/view/admin/customer/add.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("register")) {
			request.getRequestDispatcher("/view/user/register.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("edit")) {
			Customer user = this.cusDAO.getUser(request.getParameter("id"));
			request.setAttribute("user", user);
			request.getRequestDispatcher("/view/admin/customer/edit.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("delete")) {
			this.cusDAO.deleteUser(request.getParameter("id"));
			List<Customer> users = this.cusDAO.getAllUser();
			request.setAttribute("listUsers", users);
			response.sendRedirect(request.getContextPath() + "/Customer");
		} else {
			List<Customer> users = this.cusDAO.getAllUser();
			request.setAttribute("listUsers", users);
			request.getRequestDispatcher("/view/admin/customer/list.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		if(action != null && action.equalsIgnoreCase("register")) {
			Customer user = new Customer();
			user.setId(request.getParameter("id"));
			user.setName(request.getParameter("name"));
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			if (user.getId() == null) {
				this.cusDAO.insertUser(user);
			} else {
				this.cusDAO.updateUser(user);
			}
			doGet(request, response);
		} else if (action != null && action.equalsIgnoreCase("add")) {
			Customer user = new Customer();
			 user.setId(request.getParameter("id"));
			 user.setName(request.getParameter("name"));
			 user.setUsername(request.getParameter("username"));
			 user.setPassword(request.getParameter("password"));
			 user.setEmail(request.getParameter("email"));
			 user.setPhone(request.getParameter("phone"));
			 user.setAddress(request.getParameter("address"));
			 if (user.getId() == null) {
			 	this.cusDAO.insertUser(user);
			 } else {
			 	this.cusDAO.updateUser(user);
			 }
			 doGet(request, response);
		}
	}
}
