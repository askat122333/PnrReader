package com.mainTeam.Hakaton.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pnr_history")
public class PnrHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String companyName;
    private String flightNumber;
    private String airplaneNumber;
    private String arrivalTime;
    private String departureTime;
    private String departureAirport;
    private String arrivalAirport;
    private String terminal;
    private String date;
    private String weekDay;
    private String month;

    @Override
    public String toString() {
        return
                date + ' ' + month + ',' + departureTime + " -- "
                        + arrivalTime + ',' + departureAirport +
                        " -- " + arrivalAirport + ',' + airplaneNumber + ',' + companyName + ';';

    }
}
