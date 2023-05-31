package com.security.services;

import com.security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User>list = new ArrayList<>();

public UserService(){
    list.add(new User("Shubham","shubham","shubham@gmail.com"));
    list.add(new User("Aniket","aniket","aniket@gmail.com"));

}
//get allUsers

    public List<User>getAllUsers(){

    return this.list;
    }

    public User getUser(String username) {

        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user){
    this.list.add(user);

    return user;

    }
}
