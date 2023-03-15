package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.User;
import com.mainTeam.Hakaton.model.UserDto;
import com.mainTeam.Hakaton.model.UserSaveDto;
import com.mainTeam.Hakaton.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserService {
    @Autowired
UserRepository userRepo;
    public UserDto getById(Long id) {
        Optional<User> user = userRepo.findById(id);
        UserDto  userDto = new UserDto();
        if (user.isPresent()) {
            userDto.setId(user.get().getId());
            userDto.setLogin(user.get().getLogin());
            userDto.setPhoneNumber(user.get().getPhoneNumber());
        }
        return userDto;
    }
    public List<UserDto> getAllUser() {
        List<User> users = userRepo.findAll();
        List<UserDto> usersDto = new ArrayList<>();

        for (User user: users) {
            UserDto dto = mapToDto(user);
            usersDto.add(dto);
        }
        return usersDto;
    }

    public Long saveNewPerson(UserSaveDto userSaveDto) {
        User user = new User();
        user.setLogin(userSaveDto.getLogin());
        user.setPassword(userSaveDto.getPassword());
        return userRepo.save(user).getId();
    }
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }
public User updateUser (UserDto userDto) {
        User user = userRepo.findById(userDto.getId()).get();
    if (user.getLogin() == null) user.setLogin(userDto.getLogin());
    if(user.getPhoneNumber() == null) user.setPhoneNumber(userDto.getPhoneNumber());
    return userRepo.save(user);
}

    private UserDto mapToDto (User user) {
        return new UserDto(
                user.getId(),
                user.getLogin(),
                user.getPhoneNumber()
        );
    }
}
