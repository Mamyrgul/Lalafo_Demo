package service;

import models.Announcement;

import java.util.List;

public interface AnnouncementService {
    Announcement getAnnouncementById(Long id);
    List<Announcement> getAllAnnouncements();
    String saveAnnouncement(Announcement announcement);
    Announcement updateAnnouncement(Long id,Announcement announcement);
    void deleteAnnouncementById(Long id);
}
