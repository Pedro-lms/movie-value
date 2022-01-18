package com.example.movielist.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_score")
public class Score {
    @EmbeddedId
    private ScorePK id = new ScorePK();
    @Column(name = "value")
    private Double value;

    public void setMovie(Movie movie){
        id.setMovie(movie);
    }

    public void setUser(User user){
        id.setUser(user);
    }

    @ManyToOne(optional = true)
    private Movie movies_id;

    public Movie getMovies_id() {
        return movies_id;
    }

    public void setMovies_id(Movie movies_id) {
        this.movies_id = movies_id;
    }

    @ManyToOne(optional = false)
    private Movie movie_id;

    public Movie getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Movie movie_id) {
        this.movie_id = movie_id;
    }
}
