package com.bloodycaps.disneyApiRest.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_characters")
    private Integer idCharacter;
    private String name;
    private String image;
    private Integer age;
    private Integer weight;
    private String history;
    @OneToMany(mappedBy = "movieSerie")
    private List<CharactersMovie> movies;

    public List<CharactersMovie> getMovies() {
        return movies;
    }

    public void setMovies(List<CharactersMovie> movies) {
        this.movies = movies;
    }

    public Integer getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(Integer idCharacter) {
        this.idCharacter = idCharacter;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
