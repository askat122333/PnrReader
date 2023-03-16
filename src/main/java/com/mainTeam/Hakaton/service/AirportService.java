package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.Airport;
import com.mainTeam.Hakaton.repository.AirportRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AirportService {

    AirportRepo airportRepo;

    public Airport getByAirportPnr(String airportCode) {
        return airportRepo.getByAirportCode(airportCode);
    }

    public Airport getAirportById(Long id) {
        return airportRepo.findById(id).get();
    }

    public List<Airport> getAllAirport() {
        return airportRepo.findAll();
    }

    public Airport saveAirport(Airport airport) {
        return airportRepo.save(airport);
    }

    public Airport updateAirport(Airport airport) {
        Airport airport1 = airportRepo.findById(airport.getId()).get();
        airport1.setAirportName(airport.getAirportName());
        airport1.setNameOfCity(airport.getNameOfCity());
        airport1.setAirportCode(airport.getAirportCode());
        return airportRepo.save(airport1);
    }

    public String deleteCompany(Long id) {
        airportRepo.deleteById(id);
        return "Delete";
    }

}
