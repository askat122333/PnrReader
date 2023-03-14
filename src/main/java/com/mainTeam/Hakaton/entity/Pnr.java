package com.mainTeam.Hakaton.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pnrs")
public class Pnr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String companyName;
    private String flightNumber;
    private String airplaneNumber;
    private String airport;
    private String terminal;
    private String date;
    private String month;


}
