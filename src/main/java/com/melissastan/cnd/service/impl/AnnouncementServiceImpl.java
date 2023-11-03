package com.melissastan.cnd.service.impl;

import com.melissastan.cnd.model.Announcement;
import com.melissastan.cnd.model.PetDocument;
import com.melissastan.cnd.repository.AnnouncementRepository;
import com.melissastan.cnd.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    private final AnnouncementRepository announcementRepository;
    @Autowired
    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository){
        this.announcementRepository = announcementRepository;
    }
    public Announcement addAnnouncement(Announcement announcement) {
        return announcementRepository.save(announcement);
    }
    @Override
    public Announcement checkExpirationOnAnnouncement(Announcement announcement) {
        announcement.getDate().isAfter(announcement.getExpirationDate());
        addAnnouncement(announcement);
        return announcement;

    };
    @Override
    public List<Announcement> getAllNonExpiredAnnouncements(){
        return announcementRepository.findByIsExpired(false);
    }
}
