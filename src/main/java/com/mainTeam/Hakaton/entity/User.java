package com.mainTeam.Hakaton.entity;

import com.mainTeam.Hakaton.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import static javax.persistence.EnumType.STRING;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "login",nullable = false,unique = true)
    private String username;
    @Email
    private String email;
    @Max(16)@Min(8)
    private String password;
    @Column(name = "phone_number",nullable = false,unique = true)
    private String phoneNumber;
    @Enumerated(value = STRING)
    private Role role;
}
