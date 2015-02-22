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
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	UsersWSClient usersClient;
	EventsWSClient eventsClient;

	/**
	 * 
	 */
	public ProfileServlet() {
		usersClient = new UsersWSClient();
		eventsClient = new EventsWSClient();
	}
	
	private List<Event> getFavs(String email) {
		List<Favourite> favs = usersClient.getFavourites(email);
		List<Event> events = new ArrayList<Event>();
		for (Favourite fav : favs) {
			int eventId = fav.getEventId();
			events.add(eventsClient.getEventById(eventId));
		}

		return events;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String permission = req.getSession().getAttribute("permission").toString();
		String email = req.getSession().getAttribute("email").toString();
		if(permission.equals("user") || permission.equals("admin")) {
			List<Event> favs = getFavs(email);
			req.setAttribute("favs", favs);
			req.getRequestDispatcher("/WEB-INF/perfilusuario.jsp").forward(req, resp);
		} else {
			System.out.println("Auth error");
			req.setAttribute("error", "Usuario no registrado.");
			resp.sendRedirect("login.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if (usersClient.logIn(email, password)) {
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
