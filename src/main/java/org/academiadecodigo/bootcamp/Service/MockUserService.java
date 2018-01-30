package org.academiadecodigo.bootcamp.UserService;

import org.academiadecodigo.bootcamp.Model.User;

import java.util.HashMap;
import java.util.Map;

public class MockUserService implements UserService {

private Map<String,User> userMap = new HashMap<>();
    private Map userMap;

    @Override
    public boolean authenticate(String username, String password) {

        User user = findByName(username);
        if (user != null && user.getPassword().equals(password)){
            return true;
        } else {
            return false;
        }
    }


    @Override
    public User findByName(String username) {
        return userMap.get(username);


    }

    @Override
    public void addUser(User user) {
    userMap.put(user.getUsername(),user);

    }

    @Override
    public int count() {
        return 0;
    }


    public void setUserMap(Map userMap) {
        this.userMap = userMap;
    }

    public Map getUserMap() {
        return userMap;
    }
}
