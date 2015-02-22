package me.folixa.wsclient;

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
}
