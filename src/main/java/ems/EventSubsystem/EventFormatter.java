package ems.EventSubsystem;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import ems.DataSubsystem.Event;


public class EventFormatter implements Formatter<Event>{

	public String print(Event object, Locale locale) {
		//todo implement
		return "1";
	}

	public Event parse(String text, Locale locale) throws ParseException {
		// TODO parse by looking on the reposistory
		return new Event("Event 1", "Date 1", "Location 1", "Conference");
	}
	
}
