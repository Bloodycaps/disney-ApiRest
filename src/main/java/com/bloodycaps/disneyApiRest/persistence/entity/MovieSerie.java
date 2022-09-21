package com.bloodycaps.disneyApiRest.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "movies_series")
public class MovieSerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie_serie")
    private Integer idMovieSerie;

    private String title;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    private Integer rate;
    private String image;
    @OneToMany(mappedBy = "movieSerie")
    private List<Genre> genres;

    @OneToMany(mappedBy = "character")
    private List<CharactersMovie> characters;

    public List<CharactersMovie> getCharacters() {
        return characters;
    }

    public void setCharacters(List<CharactersMovie> characters) {
        this.characters = characters;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Integer getIdMovieSerie() {
        return idMovieSerie;
    }

    public void setIdMovieSerie(Integer idMovieSerie) {
        this.idMovieSerie = idMovieSerie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
