package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Comment;
import model.User;
import dao.CommentDAO;
import dao.CommentDAOImpl;

@WebServlet("/CommentController")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CommentDAO commentDAO;
	public CommentController() {
		super();
		this.commentDAO = new CommentDAOImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equalsIgnoreCase("edit")) {
			Comment comment = this.commentDAO.getComment(request.getParameter("PostID"), request.getParameter("id"));
			request.setAttribute("comment", comment);
			request.setAttribute("PostID", request.getParameter("PostID"));
			request.getRequestDispatcher("/view/comment/editComment.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("delete")) {
			this.commentDAO.deleteComment(request.getParameter("PostID"), request.getParameter("id"));
			response.sendRedirect(request.getContextPath() + "/Post?action=read&id=" + request.getParameter("PostID"));
		} else {
			response.sendRedirect(request.getContextPath() + "/Post");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String PostID = request.getParameter("PostID");
		Comment comment = new Comment();
		comment.setId(request.getParameter("id"));
		comment.setContent(request.getParameter("content"));
		comment.setUser((User) request.getSession().getAttribute("userSession"));
		if (comment.getId() == null) {
			this.commentDAO.insertComment(comment, PostID);
		} else {
			this.commentDAO.updateComment(comment, PostID);
		}
		response.sendRedirect(request.getContextPath() + "/Post?action=read&id=" + PostID);
	}
}
