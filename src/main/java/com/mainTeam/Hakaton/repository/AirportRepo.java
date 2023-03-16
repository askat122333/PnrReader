package com.mainTeam.Hakaton.repository;

import com.mainTeam.Hakaton.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepo extends JpaRepository<Airport,Long> {
    Airport getByAirportCode(String airportCode);
}
