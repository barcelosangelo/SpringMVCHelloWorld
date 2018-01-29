package org.academiadecodigo.bootcamp.UserService;

import org.academiadecodigo.bootcamp.Model.User;

public class MockUserService implements UserService {


    @Override
    public boolean authenticate(String username, String password) {


        return false;
    }

    @Override
    public User findByName(String username) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }
}
