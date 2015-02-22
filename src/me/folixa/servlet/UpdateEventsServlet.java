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
@WebServlet("/modificareventos")
public class UpdateEventsServlet extends HttpServlet {
	EventsWSClient client;

	/**
	 * 
	 */
	public UpdateEventsServlet() {
		client = new EventsWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String evetnId = req.getParameter("eventIdUpdate");
		
		if(req.getSession().getAttribute("permission").equals("admin")) {
			req.getRequestDispatcher("/WEB-INF/modificareventos.jsp").forward(req, resp);
		} else {
			System.out.println("Auth error");
			req.setAttribute("error", "No es admin.");
			resp.sendRedirect("login.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("eventIdUpdate"));
		String name = req.getParameter("name");
		String place = req.getParameter("place");
		String startDate = req.getParameter("startdate");
		String endDate = req.getParameter("enddate");
		String category = req.getParameter("category");
		String shortDescription = req.getParameter("shortdescription");
		String longDescription = req.getParameter("longdescription");
		
		if (req.getSession().getAttribute("permission").equals("admin")) {
			client.updateEvent(id, name, place, startDate, endDate, category, shortDescription, longDescription);
			req.getRequestDispatcher("/WEB-INF/modificareventos.jsp").forward(req, resp);
		} else {
			req.setAttribute("error", "Bad login.");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
	

}
