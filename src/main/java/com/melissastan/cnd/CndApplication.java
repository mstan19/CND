package com.melissastan.cnd;

import com.melissastan.cnd.model.PetDocument;
import com.melissastan.cnd.repository.PetDocumentRepository;
import com.melissastan.cnd.service.PetDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class CndApplication {

    public static void main(String[] args) {
        SpringApplication.run(CndApplication.class, args);

    }

    //    @Autowired
//    ApprovalService approvalService;
    @Autowired
    PetDocumentService petDocumentService;

    @Autowired
    PetDocumentRepository petDocumentsRepository;

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            PetDocument petDocument1 = new PetDocument();
            PetDocument petDocument2 = new PetDocument();
            petDocument1.setUrl("https://melissastan.com");
            petDocument1.setDate(LocalDate.now());
            petDocument1.setTypeOfDocument("photo");
            petDocument1.setStatus("pending");

            petDocument2.setUrl("https://melissastan.com");
            petDocument2.setDate(LocalDate.now());
            petDocument2.setTypeOfDocument("photo");
            petDocument2.setStatus("approved");
            petDocumentService.addPetDocument(petDocument1);
            petDocumentService.addPetDocument(petDocument2);

            petDocumentService.approvePendingPetDocument(petDocument1);
//            System.out.println("here");
//            System.out.println( petDocumentsRepository.findAll());
            petDocumentService.deletePetDocument(petDocument1.getId());
            petDocumentsRepository.findAll();

        };
    }

}
