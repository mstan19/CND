package com.melissastan.cnd.service.impl;

import com.melissastan.cnd.repository.GeneralInformationRepository;
import com.melissastan.cnd.repository.PetDocumentRepository;
import com.melissastan.cnd.service.GeneralInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class GeneralInformationServiceImpl implements GeneralInformationService {
    private final GeneralInformationRepository generalInformationRepository;
    private PetDocumentRepository petDocumentRepository;
    private final List<Integer> listOfNumbers = new ArrayList<Integer>();

    @Autowired
    public GeneralInformationServiceImpl(GeneralInformationRepository generalInformationRepository) {
        this.generalInformationRepository = generalInformationRepository;
    }
    @Override
    public int calculateAge(LocalDate dateOfBirth){
        LocalDate today = LocalDate.now();
        int age = Period.between(dateOfBirth, today).getYears();
        return age;
    };
    @Override
    public List<Integer> calculateLastVetVisit(LocalDate lastReportUploaded){
        LocalDate today = LocalDate.now();
        Period age = Period.between(lastReportUploaded, today);
        int years = age.getYears();
        int months = age.getMonths();
        listOfNumbers.add(years);
        listOfNumbers.add(months);
        //first number is year and second num is months
        return listOfNumbers;
    }
}
