package com.melissastan.cnd.service.impl;

import com.melissastan.cnd.model.PetDocuments;
import com.melissastan.cnd.repository.PetDocumentsRepository;
import com.melissastan.cnd.service.ApprovalService;
import com.melissastan.cnd.service.PetDocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetDocumentsServiceImpl implements PetDocumentsService {
    private final PetDocumentsRepository petdocRepo;
    @Autowired
    public PetDocumentsServiceImpl(PetDocumentsRepository petdocRepo){
        this.petdocRepo = petdocRepo;
    }

    @Override
    public List<String> findDocsByStatus(String status) {
        List<PetDocuments> listOfPetDocs= petdocRepo.findAll();
        System.out.println(listOfPetDocs);
        System.out.println("asnwer");
        System.out.println(listOfPetDocs.stream()
                .map((listOfPetDoc) -> listOfPetDoc.getStatus())
                .collect(Collectors.toList()));
        return listOfPetDocs.stream()
                .map((listOfPetDoc) -> listOfPetDoc.getStatus())
                .collect(Collectors.toList());
//        System.out.println(petdocRepo.findByStatus(status));
//        return listOfPetDocs.findByStatus(status);
    }
    public PetDocuments addPetDocument(PetDocuments petdoc) {
        return petdocRepo.save(petdoc);
    }




//    @Override
//    public void addPendingObject(PetDocuments petdoc){

//    };
//    @Override
//    public List<PetDocuments> getPendingObjects(){
//        System.out.println("get pending objects1");
//
//        System.out.println(petdocRepo.findAll());
//        System.out.println("get pending objects");
//        return petdocRepo.findAll();
//    };

    @Override
    public void approvePendingObjects(Object obj){

    };
}
