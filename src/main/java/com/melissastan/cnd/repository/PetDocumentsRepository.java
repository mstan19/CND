package com.melissastan.cnd.repository;

import com.melissastan.cnd.model.PetDocuments;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PetDocumentsRepository extends ListCrudRepository<PetDocuments, Long> {
    void deleteDocumentById(Long id);

    List<PetDocuments> findByStatus(String status);

}
