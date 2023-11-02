package com.melissastan.cnd.service;

import com.melissastan.cnd.model.PetDocuments;
import com.melissastan.cnd.repository.PetDocumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AWSApprovalServiceImpl implements ApprovalService{
    private final PetDocumentsRepository petdocRepo;
    @Autowired
    public AWSApprovalServiceImpl(PetDocumentsRepository petdocRepo){
        this.petdocRepo = petdocRepo;
    }

    @Override
    public void addPendingObject(PetDocuments petdoc){

    };
    @Override
    public List<PetDocuments> getPendingObjects(){
        System.out.println("get pending objects");

        System.out.println(petdocRepo.findAll());
        System.out.println("get pending objects");
            return petdocRepo.findAll();
    };

    @Override
    public void approvePendingObjects(Object obj){

    };
}
