package com.javaproject.CND.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;

public class Record implements Serializable {
    public Record() {}

    public Record(Long id, LocalDate date, String status, Object pdf) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.pdf = pdf;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private String status;
    private Object pdf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getPdf() {
        return pdf;
    }

    public void setPdf(Object pdf) {
        this.pdf = pdf;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", pdf=" + pdf +
                '}';
    }
}
