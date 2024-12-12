package service.serviceImpl;

import dao.UserDao;
import dao.daoImpl.UserDaoImpl;
import models.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoImpl();
    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public String saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        return userDao.updateUser(id,user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }
}
