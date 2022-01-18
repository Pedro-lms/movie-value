package com.example.movielist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "title")
    String title;
    @Column(name = "score")
    Double score;
    @Column(name = "count")
    Integer count;
    @Column(name = "image")
    String image;

    @OneToMany(mappedBy = "movie_id")
    public Set<Score> scores = new HashSet<Score>();
}
