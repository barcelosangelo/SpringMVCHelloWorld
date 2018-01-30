package org.academiadecodigo.bootcamp.Service;

import org.academiadecodigo.bootcamp.Model.User;

import java.util.Map;

public class MockUserService implements UserService {

    private Map<String, User> users;

    @Override
    public boolean authenticate(String username, String password) {

        User user = findByName(username);

        if (user != null && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public User findByName(String username) {
        return users.get(username);


    }

    @Override
    public void addUser(User user) {
        users.put(user.getUsername(), user);

    }

    @Override
    public int count() {
        return 0;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }
}
