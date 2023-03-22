package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.User;
import com.mainTeam.Hakaton.enums.Role;
import com.mainTeam.Hakaton.model.UserDto;
import com.mainTeam.Hakaton.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
UserRepository userRepo;
    public UserDto getById(Long id) {
        Optional<User> user = userRepo.findById(id);
        UserDto  userDto = new UserDto();
        if (user.isPresent()) {
            userDto.setId(user.get().getId());
            userDto.setUsername(user.get().getUsername());
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

     public User createUser(User user){
        user.setRole(Role.USER);
        return userRepo.save(user);
     }
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }
    public User updateUser (UserDto userDto) {
        User user = userRepo.findById(userDto.getId()).get();
    if (user.getUsername() == null) user.setUsername(userDto.getUsername());
    if(user.getPhoneNumber() == null) user.setPhoneNumber(userDto.getPhoneNumber());
    return userRepo.save(user);
}

    private UserDto mapToDto (User user) {
        return new UserDto(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getPhoneNumber()
        );
    }
}
