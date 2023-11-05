package com.melissastan.cnd;

import com.melissastan.cnd.model.Announcement;
import com.melissastan.cnd.model.Event;
import com.melissastan.cnd.model.GeneralInformation;
import com.melissastan.cnd.model.PetDocument;
import com.melissastan.cnd.repository.AnnouncementRepository;
import com.melissastan.cnd.repository.EventRepository;
import com.melissastan.cnd.repository.GeneralInformationRepository;
import com.melissastan.cnd.repository.PetDocumentRepository;
import com.melissastan.cnd.service.AnnouncementService;
import com.melissastan.cnd.service.EventService;
import com.melissastan.cnd.service.GeneralInformationService;
import com.melissastan.cnd.service.PetDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class CndApplication {

    public static void main(String[] args) {
        SpringApplication.run(CndApplication.class, args);

    }
    @Autowired
    PetDocumentService petDocumentService;
    @Autowired
    PetDocumentRepository petDocumentsRepository;
    @Autowired
    AnnouncementService announcementService;
    @Autowired
    AnnouncementRepository announcementRepository;
    @Autowired
    GeneralInformationService generalInformationService;
    @Autowired
    GeneralInformationRepository generalInformationRepository;
    @Autowired
    EventService eventService;
    @Autowired
    EventRepository eventRepository;
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
//            PETDOCUMENT
            PetDocument petDocument1 = new PetDocument();
            PetDocument petDocument2 = new PetDocument();
            petDocument1.setUrl("https://melissastan.com");
            petDocument1.setDate(LocalDate.now());
            petDocument1.setTypeOfDocument("photo");
            petDocument1.setStatus("pending");

            petDocument2.setUrl("https://melissastan.com");
            petDocument2.setDate(LocalDate.now());
            petDocument2.setTypeOfDocument("report");
            petDocument2.setStatus("approved");
            petDocumentService.addPetDocument(petDocument1);
            petDocumentService.addPetDocument(petDocument2);

            petDocumentService.approvePendingPetDocument(petDocument1);
//            System.out.println("here");
//            System.out.println( petDocumentsRepository.findAll());
            petDocumentService.getLastReport();
//            System.out.println("last report above");
//            petDocumentService.deletePetDocument(petDocument1.getId());
//            petDocumentsRepository.findAll();
//            petDocumentService.findPetDocument(petDocument2.getId());

            //ANNOUNCEMENT
//            Announcement announcement1 = new Announcement();
//            Announcement announcement2 = new Announcement();
//            LocalDate today = LocalDate.now();
//            LocalDate nextWeek = today.plusWeeks(2);
//            LocalDate lastWeek = today.minusWeeks(2);
//
//            announcement1.setDate(today);
////            false
//            announcement1.setExpired(nextWeek.isBefore(today));
//            announcement1.setMessage("asdasdadasda");
//            announcement1.setExpirationDate(announcementService.createExpirationDateForAnnouncement(announcement1));
////            System.out.println(nextWeek.isAfter(today));
//            announcement2.setDate(today);
//            //true
//            announcement2.setExpired(lastWeek.isBefore(today));
//            announcement2.setMessage("asdasdadasda");
//            announcement2.setExpirationDate(lastWeek);
//            announcementService.checkAndSaveOrDeleteExpirationOnAnnouncement(announcement1);
//            announcementService.checkAndSaveOrDeleteExpirationOnAnnouncement(announcement2);
//            announcementService.getAllNonExpiredAnnouncements();
//            announcementService.updateMessageOnAnnouncement(announcement1, "hi");


            //            GENERAL INFORMATION
            GeneralInformation generalInformation1 = new GeneralInformation();
            generalInformation1.setDescription("sdfsdf");
            generalInformation1.setGender("female");
            generalInformation1.setBreed("cutie");
            LocalDate today = LocalDate.now();
            generalInformation1.setDateOfBirth(today.minusYears(1));
            generalInformationService.calculateAge(generalInformation1.getDateOfBirth());
            generalInformationService.calculateLastVetVisit(petDocumentService.getLastReport().getDate());


            //Event
            Event event1 = new Event();
            event1.setTypeOfEvent("play");
            event1.setDateTimeOfEvent(LocalDateTime.now());
            eventService.addEvent(event1);
            Event event2 = new Event();
            event2.setTypeOfEvent("play");
            event2.setDateTimeOfEvent(LocalDateTime.now());
            eventService.addEvent(event2);
            Event event3 = new Event();
            event3.setTypeOfEvent("play");
            event3.setDateTimeOfEvent(LocalDateTime.of(2024,12,10,05,23,2,5));
            eventService.addEvent(event3);
            System.out.println("findall events");
//            eventService.deleteEvent(event1);
            eventService.updateTypeOfEvent(event1, "eat");
            System.out.println(eventRepository.findAll());
            eventService.getLatestEvent();
            eventService.getEventsFrom2Weeks();


        };
    }

}
