package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.FlightNumber;
import com.mainTeam.Hakaton.entity.Terminal;
import com.mainTeam.Hakaton.repository.FlightNumRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FlightNumberService {
    @Autowired
    FlightNumRepo flightNumRepo;
    public FlightNumber getByFlightNumber (String flightNumberPnr) {
       return flightNumRepo.getByFlightNumber(flightNumberPnr);
    }
    public FlightNumber getFlightNumberById (Long id) {
        return   flightNumRepo.findById(id).get();
    }
    public List<FlightNumber> getAllFlightNumber () {
        return flightNumRepo.findAll();
    }
    public FlightNumber saveFlightNumber(FlightNumber flightNumber ) {
        return     flightNumRepo.save(flightNumber);
    }
    public FlightNumber updateFlightNumber (FlightNumber flightNumber) {
        FlightNumber flightNumber1 = flightNumRepo.findById(flightNumber.getId()).get();
        flightNumber1.setFlightNumber(flightNumber.getFlightNumber());
        return  flightNumRepo.save(flightNumber1);

    }
    public String deleteFlightNumberById (Long id) {
        flightNumRepo.deleteById(id);
        return  "Delete" ;
    }

}
