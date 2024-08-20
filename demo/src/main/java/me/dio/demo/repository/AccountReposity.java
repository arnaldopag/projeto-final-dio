package me.dio.demo.repository;

import me.dio.demo.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountReposity extends JpaRepository<Account, UUID> {
}
