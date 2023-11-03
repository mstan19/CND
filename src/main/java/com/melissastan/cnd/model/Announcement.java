package com.melissastan.cnd.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class Announcement implements Serializable {
    public Announcement() {}

    public Announcement(Long id, LocalDate date, String message, LocalDate expirationDate, boolean isExpired) {
        this.id = id;
        this.date = date;
        this.message = message;
        this.expirationDate = expirationDate;
        this.isExpired = isExpired;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = true)
    private LocalDate date;
    private String message;
    @Column(nullable = false, updatable = false)
    private LocalDate expirationDate;
    private boolean isExpired;

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        this.isExpired = expired;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "date=" + date +
                ", message='" + message + '\'' +
                ", expirationDate=" + expirationDate +
                ", isExpired=" + isExpired +
                '}';
    }
}
