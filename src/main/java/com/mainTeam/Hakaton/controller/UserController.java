package com.mainTeam.Hakaton.controller;

import com.mainTeam.Hakaton.config.JwtUtil;
import com.mainTeam.Hakaton.entity.User;

import com.mainTeam.Hakaton.model.UserSaveDto;
import com.mainTeam.Hakaton.service.DetailsUser;
import com.mainTeam.Hakaton.service.PnrService;
import com.mainTeam.Hakaton.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    UserService userService;
    PnrService pnrService;
    JwtUtil jwtUtil;
    @GetMapping("/pnrReader/{pnr}")
    public String getPnrInNorm(@PathVariable String pnr){
        return pnrService.getPnrInNorm(pnr);
    }
        @PostMapping("/save")
    public String register(@RequestBody UserSaveDto usersaveDto) {
        User user = new User();
        user.setUsername(usersaveDto.getUsername());
        user.setEmail(usersaveDto.getEmail());
        user.setPassword(usersaveDto.getPassword());
        user.setPhoneNumber(usersaveDto.getPhoneNumber());
        userService.createUser(user);
        DetailsUser detailsUser = new DetailsUser(user);
        return jwtUtil.generateToken(user);
    }
}
