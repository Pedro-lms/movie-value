package com.example.movielist.repositories;

import com.example.movielist.model.Score;
import com.example.movielist.model.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
