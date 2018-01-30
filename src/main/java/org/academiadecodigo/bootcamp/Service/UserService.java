package org.academiadecodigo.bootcamp.Service;

import org.academiadecodigo.bootcamp.Model.User;

public interface UserService {

boolean authenticate(String username,String password);

User findByName(String username);

void addUser(User user);

int count();



}

