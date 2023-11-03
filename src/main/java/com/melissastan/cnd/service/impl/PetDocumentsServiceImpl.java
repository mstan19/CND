package com.melissastan.cnd.service.impl;

import com.melissastan.cnd.model.PetDocuments;
import com.melissastan.cnd.repository.PetDocumentsRepository;
import com.melissastan.cnd.service.ApprovalService;
import com.melissastan.cnd.service.PetDocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetDocumentsServiceImpl implements PetDocumentsService {
    private final PetDocumentsRepository petdocRepo;
    @Autowired
    public PetDocumentsServiceImpl(PetDocumentsRepository petdocRepo){
        this.petdocRepo = petdocRepo;
    }

    @Override
    public List<PetDocuments> findDocsByStatus(String status) {
        return petdocRepo.findByStatus(status);
    }
    public PetDocuments addPetDocument(PetDocuments petdoc) {
        return petdocRepo.save(petdoc);
    }
    @Override
    public PetDocuments approvePendingPetDocument(PetDocuments petdoc){
        petdoc.setStatus("approved");
        addPetDocument(petdoc);
        return petdoc;

    };
}
