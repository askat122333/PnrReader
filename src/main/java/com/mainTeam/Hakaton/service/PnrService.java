package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.Pnr;
import com.mainTeam.Hakaton.repository.PnrRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PnrService {
    @Autowired
    PnrRepo pnrRepo;
    @Autowired
    CompanyService companyService;
    @Autowired
    FlightNumberService flightNumberService;
    @Autowired
    MonthService monthService;
    @Autowired
    AirplaneNumberService airplaneNumberService;

    @Autowired
    AirportService airportService;
    @Autowired
    TerminalService terminalService;
public  String getPnrInNorm(String pnr) {
    StringBuilder stringBuilder = new StringBuilder(pnr.replaceAll("\\s", ""));
    stringBuilder.length();
    Pnr pnr1 = new Pnr();
        pnr1.setCompanyName(companyService.getCompany(stringBuilder.substring(0,2)).getCompanyName());
        pnr1.setFlightNumber(flightNumberService.getByFlightNumber(stringBuilder.substring(2,6)).getFlightNumber());
        pnr1.setDate(stringBuilder.substring(7,9));
        pnr1.setMonth(monthService.getByMonthPnr(stringBuilder.substring(9,12)).getMonth());
        pnr1.setWeekDay(stringBuilder.substring(12,13));
        pnr1.setDepartureTime(stringBuilder.substring(22,26));
        pnr1.setArrivalTime(stringBuilder.substring(26,30));
        pnr1.setDepartureAirport(airportService.getByAirportPnr(stringBuilder.substring(13,16)).getAirportName());
        pnr1.setArrivalAirport(airportService.getByAirportPnr(stringBuilder.substring(16,19)).getAirportName());
        pnr1.setTerminal(stringBuilder.substring(19,22));
        pnr1.setAirplaneNumber(airplaneNumberService.getByNumber(stringBuilder.substring(30,33)).getName());


    return pnr1.toString();
}
}
