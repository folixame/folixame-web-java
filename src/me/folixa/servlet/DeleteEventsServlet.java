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
@WebServlet("/borrareventos")
public class DeleteEventsServlet extends HttpServlet {
	EventsWSClient client;

	/**
	 * 
	 */
	public DeleteEventsServlet() {
		client = new EventsWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int evetnId = Integer.parseInt(req.getParameter("eventIdDelete"));
		
		if(req.getSession().getAttribute("permission").equals("admin")) {
			client.deleteEvent(evetnId);
			resp.sendRedirect("listareventos");
		} else {
			System.out.println("Auth error");
			req.setAttribute("error", "No es admin.");
			resp.sendRedirect("login.jsp");
		}
	}

}
