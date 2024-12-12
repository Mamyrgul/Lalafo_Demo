package service.serviceImpl;

import dao.AnnouncementDao;
import dao.daoImpl.AnnouncementDaoImpl;
import models.Announcement;
import service.AnnouncementService;

import java.util.List;

public class AnnouncementServiceImpl implements AnnouncementService {
    public final AnnouncementDao announcementDao = new AnnouncementDaoImpl();

    @Override
    public Announcement getAnnouncementById(Long id) {
        return announcementDao.getAnnouncementById(id);
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return announcementDao.getAllAnnouncements();
    }

    @Override
    public String saveAnnouncement(Announcement announcement) {
        return announcementDao.saveAnnouncement(announcement);
    }

    @Override
    public Announcement updateAnnouncement(Long id, Announcement announcement) {
        return announcementDao.updateAnnouncement(id,announcement);
    }

    @Override
    public void deleteAnnouncementById(Long id) {
    announcementDao.deleteAnnouncementById(id);
    }
}
