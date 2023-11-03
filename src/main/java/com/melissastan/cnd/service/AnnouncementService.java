package com.melissastan.cnd.service;

import com.melissastan.cnd.model.Announcement;
import com.melissastan.cnd.model.PetDocument;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AnnouncementService {
    Announcement addAnnouncement(Announcement announcement);
    List<Announcement> getAllNonExpiredAnnouncements ();
    Announcement checkExpirationOnAnnouncement(Announcement announcement);
}

