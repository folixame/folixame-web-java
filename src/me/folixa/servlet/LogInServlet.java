/**
 * 
 */
package me.folixa.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.folixa.wsclient.UsersWSClient;

/**
 * @author jorgeyp
 *
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	UsersWSClient client;

	/**
	 * 
	 */
	public LoginServlet() {
		client = new UsersWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.sendRedirect("login.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if (client.logIn(email, password)) {
			req.getSession().setAttribute("email", email);
			req.getSession().setAttribute("password", password); // :'( ... el tiempo apremia. TODO fix
			req.getSession().setAttribute("permission", "user");
			resp.sendRedirect("index");
			if (client.isAdmin(email)) {
				req.getSession().setAttribute("permission", "admin");
			}
		} else {
			req.getSession().setAttribute("permission", "anonymous");
			req.setAttribute("error", "Bad login.");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
	

}
