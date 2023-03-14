package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.AirplaneNumber;
import com.mainTeam.Hakaton.repository.AirplaneNumberRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AirplaneNumberService {
    @Autowired
    AirplaneNumberRepo airplaneNumberRepo;
    public AirplaneNumber getByNumber(String numberPnr){
       return  airplaneNumberRepo.getByNumberPnr(numberPnr);
    }
}
