package me.dio.demo.models.user;

public record UserRequestDTO(
        String name,
        String cpf,
        String login,
        String password,
        UserRole role,
        String email
) {
}