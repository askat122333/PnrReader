package com.mainTeam.Hakaton.controller;

import com.mainTeam.Hakaton.entity.Pnr;
import com.mainTeam.Hakaton.model.UserDto;
import com.mainTeam.Hakaton.service.PnrService;
import com.mainTeam.Hakaton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Moderator")
public class ModeratorController {
    @Autowired
    PnrService pnrService;
    @Autowired
    UserService userService;
    @GetMapping ("/pnr_reader/{pnr}")
    public String getPnrInNorm(@PathVariable String pnr){
        return pnrService.getPnrInNorm(pnr);
    }
    @PutMapping("/pnr/update")
    public Pnr updatePnr(Pnr pnr) {
        return pnrService.updatePnr(pnr);
    }
    @GetMapping("/user/{id}")
    public UserDto getById (@PathVariable Long id) {
        return userService.getById(id);
    }
    @GetMapping("/user/all")
    public List<UserDto> getAll () {
        return userService.getAllUser();
    }
    @GetMapping("/pnr/all")
    public List<Pnr> getAllPnr () {
        return pnrService.getAllPnr();
    }
    @GetMapping("/pnr/{id}")
    public Pnr getPnrById (@PathVariable Long id) {
        return pnrService.getById(id);
    }
}
