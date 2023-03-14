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
    String pnrWithOutSpaces =pnr.replaceAll("\\s", "");
    String companyNamePnr = pnrWithOutSpaces.substring(0,2);
    String flightNumberPnr = pnrWithOutSpaces.substring(2,6);
    String datePnr = pnrWithOutSpaces.substring(7,9);
    String monthPnr = pnrWithOutSpaces.substring(9,12);
    String weekDay = pnrWithOutSpaces.substring(12,13);
    String departureAirportPnr = pnrWithOutSpaces.substring(13,16);
    String arrivalAirportPnr = pnrWithOutSpaces.substring(16,19);
    String terminal = pnrWithOutSpaces.substring(19,22);
    String departureTime = pnrWithOutSpaces.substring(22,26);
    String arrivalTime = pnrWithOutSpaces.substring(26,30);
    String airplanePnr = pnrWithOutSpaces.substring(30,33);


    Pnr pnr1 = new Pnr();
    pnr1.setCompanyName(companyService.getCompany(companyNamePnr).getCompanyName());
    pnr1.setFlightNumber(flightNumberService.getByFlightNumber(flightNumberPnr).getFlightNumber());
    pnr1.setDate(datePnr);
    pnr1.setMonth(monthService.getByMonthPnr(monthPnr).getMonth());
    pnr1.setWeekDay(weekDay);
    pnr1.setDepartureTime(departureTime);
    pnr1.setArrivalTime(arrivalTime);
    pnr1.setDepartureAirport(airportService.getByAirportPnr(departureAirportPnr).getAirportName());
    pnr1.setArrivalAirport(airportService.getByAirportPnr(arrivalAirportPnr).getAirportName());
    pnr1.setTerminal(terminal);
    pnr1.setAirplaneNumber(airplaneNumberService.getByNumber(airplanePnr).getName());
   return pnr1.toString();
}


}
