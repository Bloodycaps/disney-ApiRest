package com.bloodycaps.disneyApiRest.domain.repository;

import com.bloodycaps.disneyApiRest.domain.dto.GenreDto;

import java.util.List;

public interface GenreDtoRepository {
    List<GenreDto> getAll();
    GenreDto save(GenreDto genreDto);
    GenreDto update(GenreDto genreDto);
    void delete(int genreId);
}
