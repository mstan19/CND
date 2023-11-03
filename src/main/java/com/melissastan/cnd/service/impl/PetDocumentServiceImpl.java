package com.melissastan.cnd.service.impl;

import com.melissastan.cnd.model.PetDocument;
import com.melissastan.cnd.repository.PetDocumentRepository;
import com.melissastan.cnd.service.PetDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetDocumentServiceImpl implements PetDocumentService {
    private final PetDocumentRepository petdocRepo;
    @Autowired
    public PetDocumentServiceImpl(PetDocumentRepository petdocRepo){
        this.petdocRepo = petdocRepo;
    }

    @Override
    public List<PetDocument> findDocsByStatus(String status) {
        return petdocRepo.findByStatus(status);
    }
    public PetDocument addPetDocument(PetDocument petDocument) {
        return petdocRepo.save(petDocument);
    }
    @Override
    public PetDocument approvePendingPetDocument(PetDocument petDocument){
        petDocument.setStatus("approved");
        addPetDocument(petDocument);
        return petDocument;

    };
    @Override
    public void deletePetDocument(Long id){
//        System.out.println(petDocument.getId());
//        System.out.println("here is my id");
        petdocRepo.deletePetDocumentById(id);
    };
}