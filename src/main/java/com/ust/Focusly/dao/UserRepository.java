package com.ust.Focusly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.Focusly.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

