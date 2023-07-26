package com.phase5.springlogelk.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.phase5.springlogelk.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
