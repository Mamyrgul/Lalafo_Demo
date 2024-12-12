package dao.daoImpl;

import dao.AnnouncementDao;
import dataBase.DataBase;
import models.Announcement;

import java.util.List;

public class AnnouncementDaoImpl implements AnnouncementDao {
    @Override
    public Announcement getAnnouncementById(Long id) {
        return DataBase.announcements.stream()
                .filter(announcement -> announcement.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return DataBase.announcements;
    }

    @Override
    public String saveAnnouncement(Announcement announcement) {
        DataBase.announcements.add(announcement);
        return "Successfully added";
    }

    @Override
    public Announcement updateAnnouncement(Long id, Announcement announcement) {
        for (Announcement announcement1:DataBase.announcements){
            if (announcement1.getId().equals(id)){
                announcement1.setName(announcement.getName());
                return announcement;
            }
        }
        return null;
    }

    @Override
    public void deleteAnnouncementById(Long id) {
    boolean delete = DataBase.announcements.removeIf(announcement -> announcement.getId().equals(id));
        System.out.println(delete?"Successfully deleted":"Try again");
    }
}
