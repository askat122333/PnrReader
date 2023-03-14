package com.mainTeam.Hakaton.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "month")
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String month;
    private String monthPnr;
}
