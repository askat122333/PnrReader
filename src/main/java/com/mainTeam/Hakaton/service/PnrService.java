package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.Pnr;
import com.mainTeam.Hakaton.repository.PnrRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    Pnr pnr1 = new Pnr();
        pnr1.setCompanyName(companyService.getCompany(stringBuilder.substring(0,2)).getCompanyName());
        pnr1.setFlightNumber(flightNumberService.getByFlightNumber(stringBuilder.substring(2,6)).getFlightNumber());
        pnr1.setDate(stringBuilder.substring(7,9));
        pnr1.setMonth(monthService.getByMonthPnr(stringBuilder.substring(9,12)).getMonth());
        pnr1.setWeekDay(stringBuilder.substring(12,13));
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder.substring(22,26));
        pnr1.setDepartureTime(String.valueOf(stringBuilder1.insert(2,":")));
        stringBuilder1 = new StringBuilder(stringBuilder.substring(26,30));
        pnr1.setArrivalTime(String.valueOf(stringBuilder1.insert(2,":")));
        pnr1.setDepartureAirport(airportService.getByAirportPnr(stringBuilder.substring(13,16)).getAirportName());
        pnr1.setArrivalAirport(airportService.getByAirportPnr(stringBuilder.substring(16,19)).getAirportName());
        pnr1.setTerminal(stringBuilder.substring(19,22));
        pnr1.setAirplaneNumber(airplaneNumberService.getByNumber(stringBuilder.substring(30,33)).getName());
    return pnr1.toString();
}
public Pnr getById (Long id) {
    return pnrRepo.findById(id).get();
}
public void deletePnr (Long id) {
    pnrRepo.deleteById(id);
}
public Pnr updatePnr (Pnr pnr) {
   Pnr pnr1 =  pnrRepo.findById(pnr.getId()).get();
   pnr1.setAirplaneNumber(pnr.getAirplaneNumber());
   pnr1.setDate(pnr.getDate());
   pnr1.setTerminal(pnr.getTerminal());
   pnr1.setMonth(pnr.getMonth());
   pnr1.setCompanyName(pnr.getCompanyName());
   pnr1.setWeekDay(pnr.getWeekDay());
   pnr1.setFlightNumber(pnr.getFlightNumber());
   pnr1.setArrivalTime(pnr.getArrivalTime());
   pnr1.setDepartureTime(pnr.getDepartureTime());
   pnr1.setArrivalAirport(pnr.getArrivalAirport());
   pnr1.setDepartureAirport(pnr.getDepartureAirport());
 return pnrRepo.save(pnr1);
}
public List<Pnr> getAllPnr () {
   return pnrRepo.findAll();
}
public Pnr savePnr (Pnr pnr) {
    return pnrRepo.save(pnr);
}
}
