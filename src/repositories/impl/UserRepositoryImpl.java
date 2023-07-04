package repositories.impl;

import models.User;
import repositories.UserRepository;

import java.util.*;

public class UserRepositoryImpl implements UserRepository {
    private static List<User> userList = new LinkedList<>();

    @Override
    public void save() {
        userList.add(new User(
                "Admin",
                21,
                "Admin@gmail",
                "admin",
                "admin")
        );
        userList.add(new User(
                "AsadbekTursunali",
                23,
                "AsadbekTursunali@gmail.com",
                "nimagap",
                "teacher")
        );
        userList.add(new User(
                "Student",
                23,
                "Student@gmail.com",
                "student",
                "student")
        );
    }

    @Override
    public void add(String username, Integer age, String email, String password, String role) {
        userList.add(new User(username, age, email, password, role));
    }

    public static List<User> getUserList() {
        return userList;
    }
}
