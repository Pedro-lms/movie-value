package com.example.movielist.repositories;

import com.example.movielist.model.Movie;
import com.example.movielist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
