package me.dio.demo.service;

import me.dio.demo.models.User;

import java.util.UUID;

public interface UserService {
   public User findByID(UUID id);

   public User create(User user);
}
