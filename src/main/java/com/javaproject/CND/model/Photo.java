package com.javaproject.CND.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Photo implements Serializable {
    public Photo() {}

    public Photo(LocalDate date, String status, String url) {
        this.date = date;
        this.status = status;
        this.url = url;
    }

    private LocalDate date;
    private String status;
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "date=" + date +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
