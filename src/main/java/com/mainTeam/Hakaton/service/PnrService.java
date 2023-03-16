package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.PnrHistory;
import com.mainTeam.Hakaton.repository.PnrRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PnrService {

    PnrRepo pnrRepo;

    CompanyService companyService;

    AirportService airportService;


    public String getPnrInNorm(String pnr) {
        StringBuilder stringBuilder = new StringBuilder(pnr.replaceAll("\\s", ""));
        PnrHistory pnr1 = new PnrHistory();
//        pnr1.setCompanyName(companyService.getByCompanyCode(stringBuilder.substring(0,2)).getCompanyName());
        String res = companyService.getByCompanyCode(stringBuilder.substring(0,2));
        pnr1.setCompanyName(res);
        pnr1.setFlightNumber(stringBuilder.substring(2,6));
        pnr1.setDate(stringBuilder.substring(7,9));
        pnr1.setMonth(stringBuilder.substring(9,12));
        pnr1.setWeekDay(stringBuilder.substring(12,13));
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder.substring(22,26));
        pnr1.setDepartureTime(String.valueOf(stringBuilder1.insert(2,":")));
        stringBuilder1 = new StringBuilder(stringBuilder.substring(26,30));
        pnr1.setArrivalTime(String.valueOf(stringBuilder1.insert(2,":")));
        pnr1.setDepartureAirport(airportService.getByAirportPnr(stringBuilder.substring(13,16)).getAirportName());
        pnr1.setArrivalAirport(airportService.getByAirportPnr(stringBuilder.substring(16,19)).getAirportName());
        pnr1.setTerminal(stringBuilder.substring(19,22));
        pnr1.setAirplaneNumber(stringBuilder.substring(30,33));
        return pnr1.toString();
    }

    public PnrHistory getById(Long id) {
        return pnrRepo.findById(id).get();
    }

    public void deletePnr(Long id) {
        pnrRepo.deleteById(id);
    }

    public PnrHistory updatePnr(PnrHistory pnrHistory) {
        PnrHistory pnrHistory1 = pnrRepo.findById(pnrHistory.getId()).get();
        pnrHistory1.setAirplaneNumber(pnrHistory.getAirplaneNumber());
        pnrHistory1.setDate(pnrHistory.getDate());
        pnrHistory1.setTerminal(pnrHistory.getTerminal());
        pnrHistory1.setMonth(pnrHistory.getMonth());
        pnrHistory1.setCompanyName(pnrHistory.getCompanyName());
        pnrHistory1.setWeekDay(pnrHistory.getWeekDay());
        pnrHistory1.setFlightNumber(pnrHistory.getFlightNumber());
        pnrHistory1.setArrivalTime(pnrHistory.getArrivalTime());
        pnrHistory1.setDepartureTime(pnrHistory.getDepartureTime());
        pnrHistory1.setArrivalAirport(pnrHistory.getArrivalAirport());
        pnrHistory1.setDepartureAirport(pnrHistory.getDepartureAirport());
        return pnrRepo.save(pnrHistory1);
    }

    public List<PnrHistory> getAllPnr() {
        return pnrRepo.findAll();
    }

    public PnrHistory savePnr(PnrHistory pnrHistory) {
        return pnrRepo.save(pnrHistory);
    }
}
