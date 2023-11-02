package com.melissastan.cnd;

import com.melissastan.cnd.model.PetDocuments;
import com.melissastan.cnd.service.ApprovalService;
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

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            PetDocuments petDocuments1 = new PetDocuments();
//            approvalService.determineClass(photo1);
            approvalService.getPendingObjects();

//            approvalService.addPendingObject(record1);
        };
    }

}
