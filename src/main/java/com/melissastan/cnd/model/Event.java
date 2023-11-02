package com.melissastan.cnd.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
public class Event implements Serializable {
    public Event() {}

    public Event(LocalDateTime feedDateTime, String typeOfFood) {
        this.feedDateTime = feedDateTime;
        this.typeOfFood = typeOfFood;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private LocalDateTime feedDateTime;
    private String typeOfFood;

    public LocalDateTime getFeedDateTime() {
        return feedDateTime;
    }

    public void setFeedDateTime(LocalDateTime feedDateTime) {
        this.feedDateTime = feedDateTime;
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
                "feedDateTime=" + feedDateTime +
                ", typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
