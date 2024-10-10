package com.vitorbelluzzo.restfulAPI_SantanderDevWeek.controller;

import com.vitorbelluzzo.restfulAPI_SantanderDevWeek.model.User;
import com.vitorbelluzzo.restfulAPI_SantanderDevWeek.services.UserService;
import com.vitorbelluzzo.restfulAPI_SantanderDevWeek.services.implementation.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findyById(@PathVariable Long id) {
    User user = userService.findById(id);
    return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User>  createUser(@RequestBody User userToCreate) {
        User user = userService.createUser(userToCreate);
        return ResponseEntity.ok(user);
    }
}
