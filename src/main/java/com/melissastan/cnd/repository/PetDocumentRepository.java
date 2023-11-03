package com.melissastan.cnd.repository;

import com.melissastan.cnd.model.PetDocument;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface PetDocumentRepository extends ListCrudRepository<PetDocument, Long> {
    void deletePetDocumentById(Long id);

    List<PetDocument> findByStatus(String status);

    Optional findPetDocumentById(Long id);

}
