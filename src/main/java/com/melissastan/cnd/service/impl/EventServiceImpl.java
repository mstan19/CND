package com.melissastan.cnd.service.impl;

import com.melissastan.cnd.model.Announcement;
import com.melissastan.cnd.model.Event;
import com.melissastan.cnd.model.PetDocument;
import com.melissastan.cnd.repository.EventRepository;
import com.melissastan.cnd.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event findEvent(Long id) {
        return eventRepository.findById(id).orElseThrow(
                () -> {
                    return new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Event with id %s not found", id));
                }
        );
    };

    @Override
    public void deleteEvent(Event event) {
        System.out.println(event.getId());
        System.out.println("i am deleting evet");
//        eventRepository.deleteEventById(event.getId());
    };
    @Override
    public Event updateTypeOfEvent (Event event, String typeOfEvent){
        event.setTypeOfEvent(typeOfEvent);
        eventRepository.save(event);
        return event;
    };
    @Override
    public Event getLatestEvent(){
        System.out.println(eventRepository.findAll().get(eventRepository.findAll().size() - 1));
        System.out.println("latest event");
       return eventRepository.findAll().get(eventRepository.findAll().size() - 1);
    }
    @Override
    public  List<Event> getEventsFrom2Weeks(){
       List<Event> eventList = eventRepository.findAll();
       List<Event> eventsInTwoWeeksRange = new ArrayList<>();
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = startDate.minusWeeks(2);
        System.out.println("enddate"+endDate);

        for (Event event : eventList) {
            if (!event.getDateTimeOfEvent().isAfter(startDate) && !event.getDateTimeOfEvent().isBefore(endDate)) {
                eventsInTwoWeeksRange.add(event);
                System.out.println("in the looooop");
            }
        }
        System.out.println(eventsInTwoWeeksRange);
         return null;
    };


}
