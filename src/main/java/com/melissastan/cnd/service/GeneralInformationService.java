package com.melissastan.cnd.service;

import com.melissastan.cnd.model.GeneralInformation;
import com.melissastan.cnd.model.PetDocument;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface GeneralInformationService {
//    PetDocument updatePetDocument(PetDocument petDocument);
    int calculateAge(LocalDate dateOfBirth);
    List<Integer> calculateLastVetVisit(LocalDate lastReportUploaded);

}
