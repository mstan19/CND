package com.melissastan.cnd.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
public class PetDocument implements Serializable {
    public PetDocument() {}

    public PetDocument(LocalDate date, String status, String url, String typeOfDocument) {
        this.date = date;
        this.status = status;
        this.url = url;
        this.typeOfDocument = typeOfDocument;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, updatable = true)
    private LocalDate date;
    @Column(nullable = false, updatable = true)
    private String status;
    @Column(nullable = false, updatable = false)
    private String url;

    public Long getId() {
        return id;
    }

    private String typeOfDocument;


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
    public String getTypeOfDocument() {
        return typeOfDocument;
    }

    public void setTypeOfDocument(String typeOfDocument) {
        this.typeOfDocument = typeOfDocument;
    }

    @Override
    public String toString() {
        return "PetDocuments{" +
                "id=" + id +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                ", typeOfDocument='" + typeOfDocument + '\'' +
                '}';
    }
}
