package me.dio.demo.repository;

import me.dio.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserReposity extends JpaRepository<User, UUID> {
}
