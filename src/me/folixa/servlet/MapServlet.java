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
		
		resp.sendRedirect("map.jsp");
	}
	


}
