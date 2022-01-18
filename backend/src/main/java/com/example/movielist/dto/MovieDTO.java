package com.example.movielist.dto;

import com.example.movielist.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MovieDTO {
    Long id;
    String title;
    Double score;
    Integer count;
    String image;

    public MovieDTO(Movie movie){
       id = movie.getId();
       title = movie.getTitle();
       score = movie.getScore();
       count = movie.getCount();
       image = movie.getImage();
    }
}

