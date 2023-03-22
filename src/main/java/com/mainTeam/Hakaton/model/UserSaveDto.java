package com.mainTeam.Hakaton.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSaveDto {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
}
