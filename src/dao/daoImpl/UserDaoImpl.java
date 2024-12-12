package dao.daoImpl;

import dao.UserDao;
import dataBase.DataBase;
import models.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User getUserById(Long id) {
        return DataBase.users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return DataBase.users;
    }

    @Override
    public String saveUser(User user) {
        DataBase.users.add(user);
        return "Successfully added";
    }

    @Override
    public User updateUser(Long id,User user) {
        for (User user1:DataBase.users){
            if (user1.getId().equals(id)){
                user1.setFirstName(user.getFirstName());
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteUserById(Long id) {
        boolean delete= DataBase.users.removeIf(user -> user.getId().equals(id));
        System.out.println(delete?"Successfully deleted":"Try again");
    }

}
