package com.melissastan.cnd.service.impl;

import com.melissastan.cnd.model.Announcement;
import com.melissastan.cnd.repository.AnnouncementRepository;
import com.melissastan.cnd.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    private final AnnouncementRepository announcementRepository;
    @Autowired
    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository){
        this.announcementRepository = announcementRepository;
    };
    @Override
    public Announcement addAnnouncement(Announcement announcement) {
        return announcementRepository.save(announcement);
    };
    @Override
    public void checkAndSaveOrDeleteExpirationOnAnnouncement(Announcement announcement) {
        if(announcement.getDate().isAfter(announcement.getExpirationDate())){
            announcement.setExpired(true);
            deleteExpiredAnnouncement(announcement);
        }else{
            announcement.setExpired(false);
            addAnnouncement(announcement);
        }
    };
    @Override
    public List<Announcement> getAllNonExpiredAnnouncements(){
        return announcementRepository.findByIsExpired(false);
    };
    @Override
    public void deleteExpiredAnnouncement(Announcement announcement){
        announcementRepository.deleteAnnouncementById(announcement.getId());
    };
    @Override
    public LocalDate createExpirationDateForAnnouncement(Announcement announcement){
        LocalDate newExpiredDate = announcement.getDate().plusWeeks(2);
        announcement.setExpirationDate(newExpiredDate);
        return announcement.getExpirationDate();
    };
}
