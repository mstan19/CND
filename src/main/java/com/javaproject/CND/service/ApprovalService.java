package com.javaproject.CND.service;

import java.util.List;

public interface ApprovalService {

//    List<Object>
    void addPendingObject(Object obj);
    List<Object> retreivesAllObject(List <Object> allObjs);
    List<Object> getPendingObjects(List <Object> allPendingObjects);
    void approvePendingObjects(Object obj);
}
