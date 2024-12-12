package dao;

import models.Announcement;
import models.User;

import java.util.List;

public interface AnnouncementDao {
    Announcement getAnnouncementById(Long id);
    List<Announcement> getAllAnnouncements();
    String saveAnnouncement(Announcement announcement);
    Announcement updateAnnouncement(Long id,Announcement announcement);
    void deleteAnnouncementById(Long id);
}
