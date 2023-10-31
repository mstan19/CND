package com.javaproject.CND.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Event implements Serializable {
    public Event() {}

    public Event(LocalDateTime feedDateTime, String typeOfFood) {
        this.feedDateTime = feedDateTime;
        this.typeOfFood = typeOfFood;
    }
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
