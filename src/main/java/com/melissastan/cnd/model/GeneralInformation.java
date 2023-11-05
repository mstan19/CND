package com.melissastan.cnd.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class GeneralInformation implements Serializable {
    public GeneralInformation() {}

    public GeneralInformation(Long id, String description, LocalDate dateOfBirth, String breed, String gender, float age, float lastVetVisit) {
        this.id = id;
        this.description = description;
        this.dateOfBirth = dateOfBirth;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.lastVetVisit = lastVetVisit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String description;
    @Column(nullable = true, updatable = false)
    private LocalDate dateOfBirth;
    @Column(nullable = true, updatable = false)
    private String breed;
    @Column(nullable = false, updatable = false)
    private String gender;
    @Column(nullable = true, updatable = true)
    private float age;
    @Column(nullable = true, updatable = true)
    private float lastVetVisit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getLastVetVisit() {
        return lastVetVisit;
    }

    public void setLastVetVisit(float lastVetVisit) {
        this.lastVetVisit = lastVetVisit;
    }

    @Override
    public String toString() {
        return "GeneralInformation{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", lastVetVisit=" + lastVetVisit +
                '}';
    }
}
