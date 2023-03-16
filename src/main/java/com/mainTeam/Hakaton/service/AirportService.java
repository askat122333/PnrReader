package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.AirplaneNumber;
import com.mainTeam.Hakaton.entity.Airport;
import com.mainTeam.Hakaton.entity.Company;
import com.mainTeam.Hakaton.repository.AirportRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AirportService {
    @Autowired
    AirportRepo airportRepo;
    public Airport getByAirportPnr(String airportPnr){
        return  airportRepo.getByAirportPnr(airportPnr);
    }

    public Airport getAirportById (Long id) {
        return   airportRepo.findById(id).get();
    }
    public List<Airport> getAllAirport () {
        return airportRepo.findAll();
    }
    public Airport saveAirport(Airport airport  ) {
        return     airportRepo.save(airport);
    }

    public Airport updateAirport (Airport airport) {
        Airport airport1 = airportRepo.findById(airport.getId()).get();
        airport1.setAirportName(airport.getAirportName());
        airport1.setNameOfCity(airport.getNameOfCity());
        airport1.setAirportPnr(airport.getAirportPnr());
        return airportRepo.save(airport1);
    }

    public String deleteCompany  (Long id) {
        airportRepo.deleteById(id);
        return  "Delete" ;
    }

}
