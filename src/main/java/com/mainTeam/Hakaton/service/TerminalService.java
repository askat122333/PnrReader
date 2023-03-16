package com.mainTeam.Hakaton.service;


import com.mainTeam.Hakaton.entity.Airport;
import com.mainTeam.Hakaton.entity.Terminal;
import com.mainTeam.Hakaton.repository.TerminalRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TerminalService {
    @Autowired
    TerminalRepo terminalRepo;

    public Terminal getByTerminalName(String terminalName){
        return  terminalRepo.getByTerminalName(terminalName);
    }
    public Terminal getTerminalById (Long id) {
      return   terminalRepo.findById(id).get();
    }
    public List<Terminal> getAllTerminal () {
        return terminalRepo.findAll();
    }
    public Terminal saveTerminal (Terminal terminal ) {
    return     terminalRepo.save(terminal);
    }
    public Terminal updateTerminal (Terminal terminal) {
        Terminal terminal1 = terminalRepo.findById(terminal.getId()).get();
        terminal1.setTerminalName(terminal.getTerminalName());
        return terminalRepo.save(terminal1) ;
    }
    public String deleteTerminalById (Long id) {
        terminalRepo.deleteById(id);
        return  "Delete" ;
    }


}

