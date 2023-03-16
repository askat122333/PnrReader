package com.mainTeam.Hakaton.controller;

import com.mainTeam.Hakaton.service.PnrService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    @Autowired
    PnrService pnrService;
    @GetMapping("/pnrReader/{pnr}")
    public String getPnrInNorm(@PathVariable String pnr){
        return pnrService.getPnrInNorm(pnr);
    }
}
