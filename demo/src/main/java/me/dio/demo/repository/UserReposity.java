package me.dio.demo.repository;

import me.dio.demo.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UserReposity extends JpaRepository<User, UUID> {
    UserDetails findByLogin(String login);
}
