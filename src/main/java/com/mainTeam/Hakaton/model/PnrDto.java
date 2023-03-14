package com.mainTeam.Hakaton.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PnrDto {
    private Long id;
    private String companyName;
    private String flightNumber;
    private String airplaneNumber;
    private String airport;
    private String date;
    private String month;

}
