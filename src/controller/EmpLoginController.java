package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.DBObject;

import converter.UserConverter;
import dao.UserDAO;
import dao.UserDAOImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/EmpLoginController")
public class EmpLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpLoginController() {
        super();
        this.userDAO = new UserDAOImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		if(request.getSession().getAttribute("userSession") != null) {
//			response.sendRedirect(request.getContextPath() + "/EmployeeController");
//			return;
//		}
		// TODO Auto-generated method stub
		request.getSession().getAttribute("message");
		request.getRequestDispatcher("/view/admin/login.jsp").forward(request, response);
		request.getSession().removeAttribute("message");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		DBObject obj = this.userDAO.authenticate(username, password);
		if (obj != null) {
			request.getSession().setAttribute("userSession", UserConverter.toUser(obj));
			response.sendRedirect(request.getContextPath() + "/Customer");
		} else {
			request.getSession().setAttribute("message", "Username หรือ Password ไม่ถูกต้อง");
			response.sendRedirect(request.getContextPath() + "/EmpLogin");
		}
	}
}
