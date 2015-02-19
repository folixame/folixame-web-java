package me.folixa.wsclient;

import java.util.ArrayList;
import java.util.List;

import me.folixa.ws.DatabaseException_Exception;
import me.folixa.ws.Event;
import me.folixa.ws.EventsCategories;
import me.folixa.ws.EventsWSService;
import me.folixa.ws.IEventsWS;

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
