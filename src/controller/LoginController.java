package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.DBObject;

import converter.CustomerConverter;
import converter.UserConverter;
import dao.CusDAO;
import dao.CusDAOImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CusDAO userDAO;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        this.userDAO = new CusDAOImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getSession().getAttribute("message");
		request.getRequestDispatcher("/view/user/login.jsp").forward(request, response);
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
			request.getSession().setAttribute("userSession", CustomerConverter.toCustomer(obj));
			response.sendRedirect(request.getContextPath() + "/Store");
		} else {
			request.getSession().setAttribute("message", "Username หรือ Password ไม่ถูกต้อง");
			response.sendRedirect(request.getContextPath() + "/Login");
		}
	}
}
