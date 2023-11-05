package com.melissastan.cnd.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
public class Event implements Serializable {
    public Event() {}

      public Event(Long id, LocalDateTime dateTimeOfEvent, String typeOfEvent, String typeOfFood) {
        this.id = id;
        this.dateTimeOfEvent = dateTimeOfEvent;
        this.typeOfEvent = typeOfEvent;
        this.typeOfFood = typeOfFood;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private LocalDateTime dateTimeOfEvent;
    private String typeOfFood;
    private String typeOfEvent;

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDateTimeOfEvent() {
        return dateTimeOfEvent;
    }

    public void setDateTimeOfEvent(LocalDateTime dateTimeOfEvent) {
        this.dateTimeOfEvent = dateTimeOfEvent;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", dateTimeOfEvent=" + dateTimeOfEvent +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", typeOfEvent='" + typeOfEvent + '\'' +
                '}';
    }
}
