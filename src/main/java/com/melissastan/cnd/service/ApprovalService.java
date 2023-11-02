package com.melissastan.cnd.service;


import com.melissastan.cnd.model.PetDocuments;

import java.util.List;

public interface ApprovalService {

    void addPendingObject(PetDocuments petdoc);
    List<PetDocuments> getPendingObjects();
//    List<Object> retreivesAllObject(List <Object> allObjs);
    void approvePendingObjects(Object obj);
}
