package com.melissastan.cnd.repository;

import com.melissastan.cnd.model.GeneralInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface GeneralInformationRepository  extends ListCrudRepository<GeneralInformation, Long> {

}
