package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.AirplaneNumber;
import com.mainTeam.Hakaton.entity.Airport;
import com.mainTeam.Hakaton.repository.AirplaneNumberRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AirplaneNumberService {
    @Autowired
    AirplaneNumberRepo airplaneNumberRepo;
    public AirplaneNumber getByNumber(String numberPnr){
       return  airplaneNumberRepo.getByNumberPnr(numberPnr);
    }
    public  AirplaneNumber getAirplaneNumberById (Long id) {
        return   airplaneNumberRepo.findById(id).get();
    }
    public List<AirplaneNumber> getAllAirplaneNumber () {
        return airplaneNumberRepo.findAll();
    }
    public AirplaneNumber saveAirplaneNumber(AirplaneNumber airplaneNumber  ) {
        return     airplaneNumberRepo.save(airplaneNumber);
    }

    public AirplaneNumber updateAirplaneNumber (AirplaneNumber airplaneNumber) {
        AirplaneNumber airplaneNumber1 = airplaneNumberRepo.findById(airplaneNumber.getId()).get();
        airplaneNumber1.setName(airplaneNumber.getName());
        airplaneNumber1.setNumberPnr(airplaneNumber.getNumberPnr());
        return airplaneNumberRepo.save(airplaneNumber1);
    }

    public String deleteAirplaneNumber  (Long id) {
        airplaneNumberRepo.deleteById(id);
        return  "Delete" ;
    }
}
