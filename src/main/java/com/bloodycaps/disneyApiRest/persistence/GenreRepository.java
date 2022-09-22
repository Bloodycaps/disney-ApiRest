package com.bloodycaps.disneyApiRest.persistence;

import com.bloodycaps.disneyApiRest.domain.dto.GenreDto;
import com.bloodycaps.disneyApiRest.domain.repository.GenreDtoRepository;
import com.bloodycaps.disneyApiRest.persistence.crud.GenreCrudRepository;
import com.bloodycaps.disneyApiRest.persistence.entity.Genre;
import com.bloodycaps.disneyApiRest.persistence.mapper.GenreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GenreRepository implements GenreDtoRepository {
    @Autowired
    private GenreCrudRepository genreCrudRepository;
    @Autowired
    private GenreMapper mapper;

    public List<GenreDto> getAll(){
        List<Genre> genres = (List<Genre>) genreCrudRepository.findAll();
        return mapper.toGenreDtos(genres);
    }

    @Override
    public GenreDto save(GenreDto genreDto) {
        Genre genre = mapper.toGenre(genreDto);
        return mapper.toGenreDto(genreCrudRepository.save(genre));
    }

    @Override
    public GenreDto update(GenreDto genreDto) {
        return null;
    }

    public Optional<Genre> getGenre(int idGenre){
        return genreCrudRepository.findById(idGenre);
    }
    @Override
    public void delete(int idGenre){
        genreCrudRepository.deleteById(idGenre);
    }
}
