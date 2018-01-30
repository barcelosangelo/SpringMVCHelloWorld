package org.academiadecodigo.bootcamp.Service;

import org.academiadecodigo.bootcamp.Model.User;

public class test {
    public static void main(String[] args) {
        UserService userService = new MockUserService();
        userService.addUser(new User(1,"a","b","c"));
        System.out.println("Must be true: "+userService.authenticate("a","b"));
    }
}
