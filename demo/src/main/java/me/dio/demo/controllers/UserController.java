package me.dio.demo.controllers;

import me.dio.demo.models.user.User;
import me.dio.demo.models.user.UserResponseDTO;
import me.dio.demo.repository.UserReposity;
import me.dio.demo.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserReposity userReposity;

    public UserController(UserService userService,
                          UserReposity userReposity){
        this.userService = userService;
        this.userReposity = userReposity;
    }

    @GetMapping("/{userID}")
    public ResponseEntity<User> findById(@PathVariable UUID userID){
        Optional<User> optionalUser = userService.findByID(userID);
        return optionalUser.map( user -> ResponseEntity.ok(user))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User userCreate = userService.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreate);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userReposity.findAll();
        return ResponseEntity.ok(users);
    }
}
