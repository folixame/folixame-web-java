package me.folixa.wsclient;

import java.util.ArrayList;
import java.util.List;

import me.folixa.ws.DatabaseException_Exception;
import me.folixa.ws.Event;
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
}
