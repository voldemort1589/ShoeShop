package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import dao.UserDAO;
import dao.UserDAOImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/Product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
	
	public ProductController() {
		super();
		this.userDAO = new UserDAOImpl();
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
		if (action != null && action.equalsIgnoreCase("add")) {
			request.getRequestDispatcher("/view/admin/product/add.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("edit")) {
			User user = this.userDAO.getUser(request.getParameter("id"));
			request.setAttribute("user", user);
			request.getRequestDispatcher("/view/user/editUser.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("delete")) {
			this.userDAO.deleteUser(request.getParameter("id"));
			List<User> users = this.userDAO.getAllUser();
			request.setAttribute("listUsers", users);
			response.sendRedirect(request.getContextPath() + "/User");
		} else {
			List<User> users = this.userDAO.getAllUser();
			request.setAttribute("listUsers", users);
			request.getRequestDispatcher("/view/admin/product/report.jsp").forward(request, response);
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		User user = new User();
		user.setId(request.getParameter("id"));
		user.setName(request.getParameter("name"));
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		if (user.getId() == null) {
			this.userDAO.insertUser(user);
		} else {
			this.userDAO.updateUser(user);
		}
		doGet(request, response);
	}
}

