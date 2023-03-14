package com.mainTeam.Hakaton.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "terminal")
public class Terminal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String terminalName;
}
