package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import dao.EmpDAO;
import dao.EmpDAOImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/Employee")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpDAO empDAO;
	
	public EmployeeController() {
		super();
		this.empDAO = new EmpDAOImpl();
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
		List<Employee> employees = null;
		Employee employee = null;
		if (action != null && action.equalsIgnoreCase("add")) {
			request.getRequestDispatcher("/view/admin/employee/add.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("edit")) {
			employee = this.empDAO.getUser(request.getParameter("id"));
			request.setAttribute("user", employee);
			request.getRequestDispatcher("/view/admin/employee/edit.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("delete")) {
			this.empDAO.deleteUser(request.getParameter("id"));
			employees = this.empDAO.getAllUser();
			request.setAttribute("listUsers", employees);
			response.sendRedirect(request.getContextPath() + "/Employee");
		} else {
			employees = this.empDAO.getAllUser();
			request.setAttribute("listUsers", employees);
			request.getRequestDispatcher("/view/admin/employee/list.jsp").forward(request, response);
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		Employee employee = new Employee();
		employee.setId(request.getParameter("id"));
		employee.setName(request.getParameter("name"));
		employee.setUsername(request.getParameter("username"));
		employee.setPassword(request.getParameter("password"));
		employee.setEmail(request.getParameter("email"));
		employee.setPhone(request.getParameter("phone"));
		employee.setSalary(Integer.parseInt(request.getParameter("salary")));
		if (employee.getId() == null) {
			this.empDAO.insertUser(employee);
		} else {
			this.empDAO.updateUser(employee);
		}
		doGet(request, response);
	}
}

