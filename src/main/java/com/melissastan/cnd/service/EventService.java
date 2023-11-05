package com.melissastan.cnd.service;

import com.melissastan.cnd.model.Event;
import com.melissastan.cnd.model.PetDocument;

import java.util.List;

public interface EventService {
    Event addEvent(Event event);
    Event findEvent(Long id);
    void deleteEvent (Event event);
    Event updateTypeOfEvent (Event event, String typeOfEvent);
    Event getLatestEvent();
    List<Event> getEventsFrom2Weeks();


}
