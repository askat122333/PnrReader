package com.mainTeam.Hakaton.controller;

import com.mainTeam.Hakaton.entity.Pnr;
import com.mainTeam.Hakaton.model.UserDto;
import com.mainTeam.Hakaton.service.PnrService;
import com.mainTeam.Hakaton.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    PnrService pnrService;
    @Autowired
    UserService userService;
    @GetMapping ("/pnr_Reader/{pnr}")
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
    @DeleteMapping("/pnr/delete/{id}")
    public void deletePnr(@PathVariable Long id){
        pnrService.deletePnr(id);
    }

}
