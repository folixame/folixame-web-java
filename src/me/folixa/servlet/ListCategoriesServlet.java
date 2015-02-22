/**
 * 
 */
package me.folixa.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.folixa.ws.events.Event;
import me.folixa.ws.events.EventsCategories;
import me.folixa.wsclient.EventsWSClient;
import me.folixa.wsclient.UsersWSClient;

/**
 * @author jorgeyp
 *
 */
@WebServlet("/listarcategorias")
public class ListCategoriesServlet extends HttpServlet {
	EventsWSClient client;
	
	/**
	 * 
	 */
	public ListCategoriesServlet() {
		client = new EventsWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if(req.getSession().getAttribute("permission").equals("admin")) {
			
			List<EventsCategories> categories = client.readCategories();			
			req.setAttribute("categories", categories);
			req.getRequestDispatcher("/WEB-INF/listarcategorias.jsp").forward(req, resp);
		} else {
			System.out.println("Auth error");
			req.setAttribute("error", "No es admin.");
			resp.sendRedirect("login.jsp");
		}
	}

}
