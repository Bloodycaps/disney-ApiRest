package com.bloodycaps.disneyApiRest.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CharactersMoviePK implements Serializable {
    @Column(name = "id_character")
    private Integer idCharacter;

    @Column(name = "id_movie")
    private Integer idMovie;

    public Integer getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(Integer idCharacter) {
        this.idCharacter = idCharacter;
    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }
}
