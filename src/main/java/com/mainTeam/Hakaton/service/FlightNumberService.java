package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.FlightNumber;
import com.mainTeam.Hakaton.repository.FlightNumRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FlightNumberService {
    @Autowired
    FlightNumRepo flightNumRepo;
    public FlightNumber getByFlightNumber (String flightNumberPnr) {
       return flightNumRepo.getByFlightNumber(flightNumberPnr);
    }
}
