package com.melissastan.cnd.repository;

import com.melissastan.cnd.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface EventRepository  extends ListCrudRepository<Event, Long> {
    Optional findEventById(Long id);

    void deleteEventById(Long id);


}
