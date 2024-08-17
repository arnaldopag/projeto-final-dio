package me.dio.demo.controllers;

import me.dio.demo.models.User;
import me.dio.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findByID(@PathVariable UUID userID){
        User user = userService.findByID(userID);
        return ResponseEntity.ok(user);
    }
}
