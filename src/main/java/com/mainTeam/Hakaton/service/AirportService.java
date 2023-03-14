package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.AirplaneNumber;
import com.mainTeam.Hakaton.entity.Airport;
import com.mainTeam.Hakaton.repository.AirportRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AirportService {
    @Autowired
    AirportRepo airportRepo;
    public Airport getByAirportPnr(String airportPnr){
        return  airportRepo.getByAirportPnr(airportPnr);
    }
}
