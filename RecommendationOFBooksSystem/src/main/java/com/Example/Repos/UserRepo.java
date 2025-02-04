package com.Example.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Example.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
 


