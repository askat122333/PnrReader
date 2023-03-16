package com.mainTeam.Hakaton.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserTest, Long> {
    UserTest findByUsername(String username);
}
