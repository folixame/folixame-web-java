/**
 * 
 */
package me.folixa.servlet.profile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.folixa.ws.events.Event;
import me.folixa.ws.users.Favourite;
import me.folixa.wsclient.EventsWSClient;
import me.folixa.wsclient.UsersWSClient;

/**
 * @author jorgeyp
 *
 */
@WebServlet("/fav")
public class FavServlet extends HttpServlet {
	UsersWSClient usersClient;
	EventsWSClient eventsClient;

	/**
	 * 
	 */
	public FavServlet() {
		usersClient = new UsersWSClient();
		eventsClient = new EventsWSClient();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String permission = req.getSession().getAttribute("permission").toString();
		if(permission.equals("user") || permission.equals("admin")) {
			int eventId = Integer.parseInt(req.getParameter("eventId"));
			String email = req.getParameter("email");
			usersClient.fav(email, eventId);
			resp.sendRedirect("profile");
		} else {
			System.out.println("Auth error");
			req.setAttribute("error", "Usuario no registrado.");
			resp.sendRedirect("login.jsp");
		}
	}
}
