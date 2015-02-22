package me.folixa.wsclient;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import me.folixa.ws.events.DatabaseException_Exception;
import me.folixa.ws.events.Event;
import me.folixa.ws.events.EventsCategories;
import me.folixa.ws.events.EventsWSService;
import me.folixa.ws.events.IEventsWS;

public class EventsWSClient {
	private EventsWSService service;
	private IEventsWS eventsws;
	
	public EventsWSClient() {
		service = new EventsWSService();
		eventsws = service.getEventsWSPort();
	}

	public void createEvent() {
		
	}
	
	public List<Event> readEvents() {
		List<Event> events = new ArrayList<Event>();
		
		try {
			events = eventsws.readEventsForUsers(1);
			
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return events;
	}
	
	public List<Event> readNextEvents() {
		List<Event> events = new ArrayList<Event>();
		Date today = new Date();
		GregorianCalendar gcal = new GregorianCalendar();
		gcal.setTime(today);
		XMLGregorianCalendar startDate = null;
		try {
			startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		GregorianCalendar gcal2 = new GregorianCalendar();
		gcal2.setTime(today);
		gcal2.add(Calendar.DATE, 10);
		XMLGregorianCalendar endDate = null;
		try {
			endDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal2);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		try {
			events = eventsws.readEventsBetweenDates(startDate, endDate);
			
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return events;
	}
	
	public List<EventsCategories> readCategories() {
		List<EventsCategories> categories = new ArrayList<EventsCategories>();
		
		try {
			categories = eventsws.readAllCategories();
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
	}
	
	public List<String> getPlaces() {
		List<String> places = new ArrayList<String>();
		List<Event> events = readEvents();
		
		for (Event event : events) {
			String place = event.getPlace();
			if (!places.contains(place)) {
				places.add(place);
			}
		}
		
		return places;	
	}
	
	public boolean createEvent(String name, String place, String startDate, String endDate, String category, String shortDescription, String longDescription) {
		List<EventsCategories> categories = readCategories();
		boolean success = false;
		int categoryId = 0;
		for (EventsCategories eventsCategory : categories) {
			if (eventsCategory.getName().equals(category)) {
				categoryId = eventsCategory.getId();
			}
		}
		
		XMLGregorianCalendar eventDateXML = toXmlGregorianDate(startDate);
		XMLGregorianCalendar startDateXML = toXmlGregorianDate(startDate);
		XMLGregorianCalendar endDateXML = toXmlGregorianDate(endDate);
		
		
		try {// TODO cambiar lo de la categor'ia
			
			int eventId = eventsws.createEvent(name, place, shortDescription, longDescription, 9, eventDateXML, startDateXML, endDateXML, 1);
			
			if (eventId != 0) {
				createImage(name, "http://mariomanzanares.files.wordpress.com/2010/03/404-not-found-not-found-the-748431-748431-1so.jpg", "image not found", eventId);
				success = true;
			}
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
	
	private int getEventId(String name) {
		List<Event> events = readEvents();
		System.out.println(name);
		for (Event event : events) {
			System.out.print("event ");
			System.out.println(event.getName());
			if (event.getName().equals(name)) {
				return event.getId();
			}
		}
		
		return 0;
	}

	boolean createImage(String name, String url, String alt, int eventId) {
		System.out.println(eventId);
		try {
			return eventsws.createImage(name, url, name, eventId);
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private XMLGregorianCalendar toXmlGregorianDate(String startDate) {
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {
			date = format.parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GregorianCalendar gcal = new GregorianCalendar();
		gcal.setTime(date);
		XMLGregorianCalendar startDateXML = null;
		try {
			startDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return startDateXML;
	}

	public boolean createCategory(String name) {
		try {
			return eventsws.createCategory(name);
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void updateEvent(int id, String name, String place, String startDate,
			String endDate, String category, String shortDescription,
			String longDescription) {
		
		XMLGregorianCalendar eventDateXML = toXmlGregorianDate(startDate);
		XMLGregorianCalendar startDateXML = toXmlGregorianDate(startDate);
		XMLGregorianCalendar endDateXML = toXmlGregorianDate(endDate);
		
		try {
			eventsws.updateEventById(id, name, place, shortDescription, longDescription, 9, eventDateXML, startDateXML, endDateXML, 1);
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO categoria
	}

	public void deleteEvent(int evetnId) {
		try {
			eventsws.deleteImagesByEventId(evetnId);
			eventsws.deleteEventById(evetnId);
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateCategory(int id, String name) {
		try {
			eventsws.updateCategoryById(id, name);
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteCategory(int id) {
		try {
			eventsws.deleteCategoryById(id);
		} catch (DatabaseException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
