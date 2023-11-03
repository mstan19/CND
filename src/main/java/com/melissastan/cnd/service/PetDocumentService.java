package com.melissastan.cnd.service;

import com.melissastan.cnd.model.PetDocument;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PetDocumentService {
    List<PetDocument> findDocsByStatus(String status);
    PetDocument addPetDocument(PetDocument petDocument);
    PetDocument approvePendingPetDocument(PetDocument petDocument);
    void deletePetDocument (Long id);

}
