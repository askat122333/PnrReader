package com.mainTeam.Hakaton.repository;

import com.mainTeam.Hakaton.entity.FlightNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightNumRepo extends JpaRepository<FlightNumber,Long> {
    FlightNumber getByFlightNumber (String flightNumberPnr);
}
