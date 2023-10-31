package com.javaproject.CND.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApprovalServiceImpl implements ApprovalService{
    @Override
    public void addPendingObject(Object obj){

    };
    @Override
    public List<Object> retreivesAllObject(List<Object> allObjs){
        List<Object> getAllObjectsList = new ArrayList<Object>();
        return getAllObjectsList;
    };
    @Override
    public List<Object> getPendingObjects(List <Object> allPendingObjects){
        List<Object> getAllPendingObjectsList = new ArrayList<Object>();
        return getAllPendingObjectsList;
    };

    @Override
    public void approvePendingObjects(Object obj){

    };
}
