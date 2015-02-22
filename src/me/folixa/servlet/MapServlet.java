/**
 * 
 */
package me.folixa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.folixa.wsclient.EventsWSClient;
import me.folixa.ws.events.Event;
import me.folixa.ws.events.EventsCategories;

import com.sun.mail.iap.Response;

/**
 * @author jorgeyp
 *
 */
@WebServlet("/map")
public class MapServlet extends HttpServlet {
	EventsWSClient client;

	/**
	 * 
	 */
	public MapServlet() {
		client = new EventsWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Event> events = client.readEvents();
		List<EventsCategories> categories = client.readCategories();
		List<String> places = client.getPlaces();

		req.setAttribute("events", events);
		req.getRequestDispatcher("map.jsp").forward(req, resp);
	}
	


}
