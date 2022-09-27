package com.bloodycaps.disneyApiRest.persistence.service;

import com.bloodycaps.disneyApiRest.persistence.entity.Genre;
import com.bloodycaps.disneyApiRest.persistence.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAll(){
        return genreRepository.getAll();
    }

    public Optional<Genre> getGenre(int genreId){
        return genreRepository.getGenre(genreId);
    }

    public boolean delete(int genreId){
        if (getGenre(genreId).isPresent()){
            genreRepository.delete(genreId);
            return true;
        }else {
            return false;
        }
    }
}
