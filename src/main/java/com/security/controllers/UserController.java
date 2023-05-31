package com.security.controllers;

import com.security.models.User;
import com.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
private UserService userService;

    //@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/")
public List<User>getAllUsers(){
    return this.userService.getAllUsers();
}
@GetMapping("/{username}")
public  User getUSer(@PathVariable("username") String username){

    return this.userService.getUser(username);
}
@PostMapping("/addUser")
public User addUser(@RequestBody User user){

    return this.userService.addUser(user);
}
}
