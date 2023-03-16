package com.mainTeam.Hakaton.controller;

import com.mainTeam.Hakaton.entity.PnrHistory;
import com.mainTeam.Hakaton.model.UserDto;
import com.mainTeam.Hakaton.service.PnrService;
import com.mainTeam.Hakaton.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    PnrService pnrService;

    UserService userService;

    @GetMapping("/pnrReader/{pnr}")
    public String getPnrInNorm(@PathVariable String pnr) {
        return pnrService.getPnrInNorm(pnr);
    }

    @PutMapping("/pnr/update")
    public PnrHistory updatePnr(PnrHistory pnrHistory) {
        return pnrService.updatePnr(pnrHistory);
    }

    @GetMapping("/user/{id}")
    public UserDto getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/user/all")
    public List<UserDto> getAll() {
        return userService.getAllUser();
    }

    @DeleteMapping("/pnr/delete/{id}")
    public void deletePnr(@PathVariable Long id) {
        pnrService.deletePnr(id);
    }

    @GetMapping("/pnr/all")
    public List<PnrHistory> getAllPnr() {
        return pnrService.getAllPnr();
    }

    @GetMapping("/pnr/{id}")
    public PnrHistory getPnrById(@PathVariable Long id) {
        return pnrService.getById(id);
    }

    @PostMapping("/pnr/save")
    public PnrHistory savePnr(@RequestBody PnrHistory pnrHistory) {
        return pnrService.savePnr(pnrHistory);
    }


}
