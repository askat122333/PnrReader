package com.mainTeam.Hakaton.repository;

import com.mainTeam.Hakaton.entity.PnrHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PnrRepo extends JpaRepository<PnrHistory,Long> {
}
