package me.dio.demo.models.user;

import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String name,
        String cpfCnpj,
        String login,
        String email
) {
    // Default constructor is implicit for records
}