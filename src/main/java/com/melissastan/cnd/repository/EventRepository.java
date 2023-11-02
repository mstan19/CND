package com.melissastan.cnd.repository;

import com.melissastan.cnd.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository  extends JpaRepository<Event, Long> {
}
