package com.cardif.arquetipojunit.arquetipojunit.repositories;

import com.cardif.arquetipojunit.arquetipojunit.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}