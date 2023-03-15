package com.mainTeam.Hakaton.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class UserSaveDto {
    private String login;
    private String password;
}
