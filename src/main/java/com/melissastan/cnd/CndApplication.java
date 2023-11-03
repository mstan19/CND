package com.melissastan.cnd;

import com.melissastan.cnd.model.Announcement;
import com.melissastan.cnd.model.PetDocument;
import com.melissastan.cnd.repository.AnnouncementRepository;
import com.melissastan.cnd.repository.PetDocumentRepository;
import com.melissastan.cnd.service.AnnouncementService;
import com.melissastan.cnd.service.PetDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
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
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            Announcement announcement1 = new Announcement();
            Announcement announcement2 = new Announcement();
            LocalDate today = LocalDate.now();
            LocalDate nextWeek = today.plusWeeks(2);
            LocalDate lastWeek = today.minusWeeks(2);

            announcement1.setDate(today);
//            false
            announcement1.setExpired(nextWeek.isBefore(today));
            announcement1.setMessage("asdasdadasda");
            announcement1.setExpirationDate(announcementService.createExpirationDateForAnnouncement(announcement1));
//            System.out.println(nextWeek.isAfter(today));
            announcement2.setDate(today);
            //true
            announcement2.setExpired(lastWeek.isBefore(today));
            announcement2.setMessage("asdasdadasda");
            announcement2.setExpirationDate(lastWeek);
            announcementService.checkAndSaveOrDeleteExpirationOnAnnouncement(announcement1);
            announcementService.checkAndSaveOrDeleteExpirationOnAnnouncement(announcement2);
            announcementService.getAllNonExpiredAnnouncements();
            System.out.println("find all ann");
            System.out.println(announcementRepository.findAll());



//            PETDOCUMENT
//            PetDocument petDocument1 = new PetDocument();
//            PetDocument petDocument2 = new PetDocument();
//            petDocument1.setUrl("https://melissastan.com");
//            petDocument1.setDate(LocalDate.now());
//            petDocument1.setTypeOfDocument("photo");
//            petDocument1.setStatus("pending");
//
//            petDocument2.setUrl("https://melissastan.com");
//            petDocument2.setDate(LocalDate.now());
//            petDocument2.setTypeOfDocument("photo");
//            petDocument2.setStatus("approved");
//            petDocumentService.addPetDocument(petDocument1);
//            petDocumentService.addPetDocument(petDocument2);
//
//            petDocumentService.approvePendingPetDocument(petDocument1);
//            System.out.println("here");
//            System.out.println( petDocumentsRepository.findAll());
//            petDocumentService.deletePetDocument(petDocument1.getId());
//            petDocumentsRepository.findAll();
//            petDocumentService.findPetDocument(petDocument2.getId());
        };
    }

}
