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
public  String getPnrInNorm(String pnr) {
    String pnrWithOutSpaces =pnr.replaceAll("\\s", "");
    String companyNamePnr = pnrWithOutSpaces.substring(0,2);
    String flightNumberPnr = pnrWithOutSpaces.substring(2,6);
    String datePnr = pnrWithOutSpaces.substring(7,9);
    String monthPnr = pnrWithOutSpaces.substring(9,12);

    Pnr pnr1 = new Pnr();
    pnr1.setCompanyName(companyService.getCompany(companyNamePnr).getCompanyName());
    pnr1.setFlightNumber(flightNumberService.getByFlightNumber(flightNumberPnr).getFlightNumber());
    pnr1.setDate(datePnr);
    pnr1.setMonth(monthService.getByMonthPnr(monthPnr).getMonth());
   return pnr1.toString();
}


}
