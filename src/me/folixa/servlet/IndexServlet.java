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

import com.sun.mail.iap.Response;

import me.folixa.ws.Event;
import me.folixa.ws.EventsCategories;
import me.folixa.ws.EventsWSService;
import me.folixa.wsclient.EventsWSClient;

/**
 * @author jorgeyp
 *
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	EventsWSClient client;

	/**
	 * 
	 */
	public IndexServlet() {
		client = new EventsWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Event> events = client.readNextEvents();
		List<EventsCategories> categories = client.readCategories();
		List<String> places = client.getPlaces();
		
		req.setAttribute("places", places);
		req.setAttribute("categories", categories);
		req.setAttribute("nextEvents", events);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	


}
