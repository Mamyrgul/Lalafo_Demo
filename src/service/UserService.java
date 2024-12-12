package service;

import models.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    String saveUser(User user);
    User updateUser(Long id,User user);
    void deleteUserById(Long id);
}
