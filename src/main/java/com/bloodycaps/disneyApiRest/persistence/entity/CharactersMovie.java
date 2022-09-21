package com.bloodycaps.disneyApiRest.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "characters_movies")
public class CharactersMovie {
    @EmbeddedId
    private CharactersMoviePK id;

    @ManyToOne
    @JoinColumn(name = "id_character", insertable = false, updatable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "id_movie", insertable = false, updatable = false)
    private MovieSerie movieSerie;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public MovieSerie getMovieSerie() {
        return movieSerie;
    }

    public void setMovieSerie(MovieSerie movieSerie) {
        this.movieSerie = movieSerie;
    }

    public CharactersMoviePK getId() {
        return id;
    }

    public void setId(CharactersMoviePK id) {
        this.id = id;
    }
}
