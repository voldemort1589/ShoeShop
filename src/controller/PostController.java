package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Post;
import model.User;
import dao.PostDAO;
import dao.PostDAOImpl;

@WebServlet("/PostController")
public class PostController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PostDAO postDAO;
	public PostController() {
		super();
		this.postDAO = new PostDAOImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equalsIgnoreCase("read")) {
			Post post = this.postDAO.getPost(request.getParameter("id"));
			request.setAttribute("post", post);
			request.getRequestDispatcher("/view/post/readPost.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("add")) {
			request.getRequestDispatcher("/view/post/createPost.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("edit")) {
			Post post = this.postDAO.getPost(request.getParameter("id"));
			request.setAttribute("post", post);
			request.getRequestDispatcher("/view/post/editPost.jsp").forward(request, response);
		} else if (action != null && action.equalsIgnoreCase("delete")) {
			this.postDAO.deletePost(request.getParameter("id"));
			List<Post> posts = this.postDAO.getAllPosts();
			request.setAttribute("listPosts", posts);
			response.sendRedirect(request.getContextPath() + "/Post");
		} else {
			List<Post> posts = this.postDAO.getAllPosts();
			request.setAttribute("listPosts", posts);
			request.getRequestDispatcher("/view/post/listPost.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Post post = new Post();
		post.setId(request.getParameter("id"));
		post.setTitle(request.getParameter("title"));
		post.setContent(request.getParameter("content"));
		post.setUser((User) request.getSession().getAttribute("userSession"));
		if (post.getId() == null) {
			this.postDAO.insertPost(post);
		} else {
			this.postDAO.updatePost(post);
		}
		doGet(request, response);
	}
}

