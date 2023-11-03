package com.melissastan.cnd.service;

import com.melissastan.cnd.model.Announcement;
import com.melissastan.cnd.model.PetDocument;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface AnnouncementService {
    Announcement addAnnouncement(Announcement announcement);
    List<Announcement> getAllNonExpiredAnnouncements ();
    void checkAndSaveOrDeleteExpirationOnAnnouncement(Announcement announcement);
    void deleteExpiredAnnouncement(Announcement announcement);
    LocalDate createExpirationDateForAnnouncement(Announcement announcement);
}

