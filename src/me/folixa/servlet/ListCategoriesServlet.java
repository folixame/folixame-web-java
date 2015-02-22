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

import me.folixa.wsclient.EventsWSClient;
import me.folixa.wsclient.UsersWSClient;

/**
 * @author jorgeyp
 *
 */
@WebServlet("/listarcategorias")
public class ListCategoriesServlet extends HttpServlet {

	/**
	 * 
	 */
	public ListCategoriesServlet() {
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if(req.getSession().getAttribute("permission").equals("admin")) {
			req.getRequestDispatcher("/WEB-INF/listarcategorias.jsp").forward(req, resp);
		} else {
			System.out.println("Auth error");
			req.setAttribute("error", "No es admin.");
			resp.sendRedirect("login.jsp");
		}
	}

}
