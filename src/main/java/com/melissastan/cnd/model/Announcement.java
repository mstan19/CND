package com.melissastan.cnd.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class Announcement implements Serializable {
    public Announcement() {}

    public Announcement(LocalDate date, String message, LocalDateTime expirationDate, boolean isExpired) {
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
    private LocalDateTime expirationDate;
    private boolean isExpired;

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

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
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
