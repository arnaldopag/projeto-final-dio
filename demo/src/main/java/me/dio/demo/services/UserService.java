package me.dio.demo.services;

import me.dio.demo.models.user.User;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
   public Optional<User> findByID(UUID id);

   public User create(User user);
}
