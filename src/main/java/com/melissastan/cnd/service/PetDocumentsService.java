package com.melissastan.cnd.service;

import com.melissastan.cnd.model.PetDocuments;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PetDocumentsService {

    List<PetDocuments> findDocsByStatus(String status);

    PetDocuments addPetDocument(PetDocuments petdoc);
//    void addPendingObject(PetDocuments petdoc);
//    List<PetDocuments> getPendingObjects();
    //    List<Object> retreivesAllObject(List <Object> allObjs);
    void approvePendingObjects(Object obj);
}
