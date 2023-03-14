package com.mainTeam.Hakaton.repository;

import com.mainTeam.Hakaton.entity.AirplaneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneNumberRepo extends JpaRepository<AirplaneNumber,Long> {
    AirplaneNumber getByNumberPnr(String numberPnr);
}
