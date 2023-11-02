package com.melissastan.cnd;

import com.melissastan.cnd.model.PetDocuments;
import com.melissastan.cnd.service.ApprovalService;
import com.melissastan.cnd.service.PetDocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CndApplication {

    public static void main(String[] args) {
        SpringApplication.run(CndApplication.class, args);

    }

    @Autowired
    ApprovalService approvalService;
    @Autowired
    PetDocumentsService petDocumentsService;

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            PetDocuments petDocuments1 = new PetDocuments();
            PetDocuments petDocuments2 = new PetDocuments();
            petDocuments1.setTypeOfDocument("pending");
            petDocuments2.setTypeOfDocument("approved");
//            TO DO : add doc to db
            petDocumentsService.addPetDocument(petDocuments1);
            petDocumentsService.addPetDocument(petDocuments2);


//            approvalService.getPendingObjects();
            petDocumentsService.findDocsByStatus("pending");

        };
    }

}
