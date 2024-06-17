package com.aashish.rest.webservices.restful_web_services.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;
    static {
        users.add(new User(++userCount, "Aashish", LocalDate.now().minusYears(21)));
        users.add(new User(++userCount, "Hash", LocalDate.now().minusYears(25)));
        users.add(new User(++userCount, "Anant", LocalDate.now().minusYears(19)));
    }
    // findAll()
    public List<User> findAll() {
        return users;
    }
    // save(User user)
    public User saveUser(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }
    // findOne(int id)

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return findAll().stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
    }
}
