package java16;

import dao.AnnouncementDao;
import dao.FavoriteDao;
import dao.UserDao;
import dao.daoImpl.AnnouncementDaoImpl;
import dao.daoImpl.FavoriteDaoImpl;
import dao.daoImpl.UserDaoImpl;
import enums.Role;
import models.Announcement;
import models.Favorite;
import models.User;

public class Main {
    public static void main(String[] args) {

        AnnouncementDao announcementDao = new AnnouncementDaoImpl();
        FavoriteDao favoriteDao = new FavoriteDaoImpl();
        UserDao userDao = new UserDaoImpl();


        System.out.println("~~~~~~~~~User Operations~~~~~~~~");
        User user1 = new User(1L, "Joke", "jgrfse.com", "password123", Role.USER);
        User user2 = new User(2L, "Janat", "janvfdmple.com", "sevfdpass", Role.ADMIN);

        userDao.saveUser(user1);
        userDao.saveUser(user2);

        System.out.println("All Users:");
        userDao.getAllUsers().forEach(System.out::println);

        System.out.println("Update User:");
        user1.setFirstName("Joke Updated");
        userDao.updateUser(user1.getId(), user1);
        System.out.println(userDao.getUserById(user1.getId()));

        System.out.println("Delete User:");
        userDao.deleteUserById(user2.getId());
        System.out.println("All Users After Deletion:");
        userDao.getAllUsers().forEach(System.out::println);

        // 2. Работа с объявлениями
        System.out.println("===== Announcement Operations =====");
        Announcement ann1 = new Announcement(1L, "Car for Sale", "Selling a car in great condition", 5000, user1.getId());
        Announcement ann2 = new Announcement(2L, "House for Rent", "A cozy 2-bedroom house for rent", 1200, user1.getId());

        announcementDao.saveAnnouncement(ann1);
        announcementDao.saveAnnouncement(ann2);

        System.out.println("All Announcements:");
        announcementDao.getAllAnnouncements().forEach(System.out::println);

        System.out.println("Update Announcement:");
        ann1.setName("Updated Car for Sale");
        announcementDao.updateAnnouncement(ann1.getId(), ann1);
        System.out.println(announcementDao.getAnnouncementById(ann1.getId()));

        System.out.println("Delete Announcement:");
        announcementDao.deleteAnnouncementById(ann2.getId());
        System.out.println("All Announcements After Deletion:");
        announcementDao.getAllAnnouncements().forEach(System.out::println);


        System.out.println("===== Favorite Operations =====");
        Favorite favorite1 = new Favorite(1L, user1.getId(), ann1.getId());

        favoriteDao.addFavorite(favorite1);

        System.out.println("All Favorites:");
        favoriteDao.listFavorites().forEach(System.out::println);

        System.out.println("Remove Favorite:");
        favoriteDao.removeFavorite(favorite1.getId());
        System.out.println("All Favorites After Removal:");
        favoriteDao.listFavorites().forEach(System.out::println);
    }
}
