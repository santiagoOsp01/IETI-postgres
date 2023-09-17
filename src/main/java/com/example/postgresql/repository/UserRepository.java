package com.example.postgresql.repository;

import com.example.postgresql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
