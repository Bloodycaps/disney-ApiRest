package com.bloodycaps.disneyApiRest.persistence.repository;

import com.bloodycaps.disneyApiRest.persistence.crud.GenreCrudRepository;
import com.bloodycaps.disneyApiRest.persistence.entity.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GenreRepository {
    @Autowired
    private GenreCrudRepository genreCrudRepository;

    public List<Genre> getAll() {
        return (List<Genre>) genreCrudRepository.findAll();
    }

    public Genre save(Genre genre) {
        return genreCrudRepository.save(genre);
    }

    public Genre update(Genre genreDto) {
        return null;
    }

    public Optional<Genre> getGenre(int idGenre) {
        return genreCrudRepository.findById(idGenre);
    }

    public void delete(int idGenre) {
        genreCrudRepository.deleteById(idGenre);
    }
}
