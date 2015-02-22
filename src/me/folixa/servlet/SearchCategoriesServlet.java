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
@WebServlet("/buscarcategorias")
public class SearchCategoriesServlet extends HttpServlet {
	UsersWSClient client;

	/**
	 * 
	 */
	public SearchCategoriesServlet() {
		client = new UsersWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if(req.getSession().getAttribute("permission").equals("admin")) {
			req.getRequestDispatcher("/WEB-INF/buscarcategorias.jsp").forward(req, resp);
		} else {
			System.out.println("Auth error");
			req.setAttribute("error", "No es admin.");
			resp.sendRedirect("login.jsp");
		}
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
			
		} else {
			req.setAttribute("error", "Bad login.");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
	

}
