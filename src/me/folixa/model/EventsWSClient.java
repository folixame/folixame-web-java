package me.folixa.model;

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
}
