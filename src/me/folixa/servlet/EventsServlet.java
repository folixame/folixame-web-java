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
import me.folixa.ws.EventsWSService;
import me.folixa.wsclient.EventsWSClient;

/**
 * @author jorgeyp
 *
 */
@WebServlet("/events")
public class EventsServlet extends HttpServlet {
	EventsWSClient client;

	/**
	 * 
	 */
	public EventsServlet() {
		client = new EventsWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		List<Event> events = client.readEvents();
		for (Event event : events) {
			out.println(event);
		}
		
	}
	


}
