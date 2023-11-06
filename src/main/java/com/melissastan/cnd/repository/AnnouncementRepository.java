package com.melissastan.cnd.repository;

import com.melissastan.cnd.model.Announcement;
import com.melissastan.cnd.model.PetDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface AnnouncementRepository extends ListCrudRepository<Announcement, Long> {

    List<Announcement> findByIsExpired(boolean isExpired);

}
