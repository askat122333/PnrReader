package com.mainTeam.Hakaton.controller;

import com.mainTeam.Hakaton.service.PnrService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    PnrService pnrService;
    @GetMapping("/pnrReader/{pnr}")
    public String getPnrInNorm(@PathVariable String pnr){
        return pnrService.getPnrInNorm(pnr);
    }
}
