package com.melissastan.cnd.repository;

import com.melissastan.cnd.model.PetDocument;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface PetDocumentRepository extends ListCrudRepository<PetDocument, Long> {

    List<PetDocument> findByStatus(String status);
    List<PetDocument> findByTypeOfDocument(String typeOfDocument);

    Optional findPetDocumentById(Long id);

}
