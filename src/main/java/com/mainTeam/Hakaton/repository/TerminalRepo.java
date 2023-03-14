package com.mainTeam.Hakaton.repository;

import com.mainTeam.Hakaton.entity.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepo extends JpaRepository<Terminal,Long> {
    Terminal getByTerminalName(String terminalName);
}
