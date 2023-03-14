package com.mainTeam.Hakaton.repository;

import com.mainTeam.Hakaton.entity.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepo extends JpaRepository<Month,Long> {
    Month getByMonthPnr (String monthPnr);
}
