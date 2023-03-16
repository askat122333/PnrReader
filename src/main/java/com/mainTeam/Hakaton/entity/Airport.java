package com.mainTeam.Hakaton.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "airports")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "city_name",nullable = false)
    private String nameOfCity;
    @Column(unique = true,nullable = false)
    private String airportName;
    @Column(unique = true,nullable = false)
    private String airportCode;

}