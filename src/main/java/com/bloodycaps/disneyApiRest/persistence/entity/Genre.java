package com.bloodycaps.disneyApiRest.persistence.entity;

import javax.persistence.*;

@Entity
@Table
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGenre;
    private String name;
    private String image;
    @Column(name = "id_movies")
    private Integer idMovie;

    @ManyToOne
    @JoinColumn(name = "id_movies", insertable = false, updatable = false)
    private MovieSerie movieSerie;

    public MovieSerie getMovieSerie() {
        return movieSerie;
    }

    public void setMovieSerie(MovieSerie movieSerie) {
        this.movieSerie = movieSerie;
    }

    public Integer getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }
}
