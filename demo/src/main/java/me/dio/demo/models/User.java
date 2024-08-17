package me.dio.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import me.dio.demo.enums.PersonType;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @Enumerated(EnumType.STRING)
    @Column
    private PersonType personType;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Card> card;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Account account;

}
