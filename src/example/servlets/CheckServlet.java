package example.servlets;

import example.classes.User;
import example.classes.utils.Security;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
		User user = new User(request.getParameter("login"), Security.getMd5Hash(request.getParameter("password")));
		System.out.println(user.getName());
		
		String forward;
		if (user.isExist()) {
			forward = "/login.jsp";
		} else {
			forward = "/register.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(forward);
		dispatcher.forward(request, response);
	}
}
