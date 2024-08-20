package me.dio.demo.repository;

import me.dio.demo.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardReposity extends JpaRepository<Card, UUID> {
}
