package com.mainTeam.Hakaton.service;


import com.mainTeam.Hakaton.entity.Airport;
import com.mainTeam.Hakaton.entity.Terminal;
import com.mainTeam.Hakaton.repository.TerminalRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TerminalService {
    @Autowired
    TerminalRepo terminalRepo;

    public Terminal getByTerminalName(String terminalName){
        return  terminalRepo.getByTerminalName(terminalName);
    }
}

