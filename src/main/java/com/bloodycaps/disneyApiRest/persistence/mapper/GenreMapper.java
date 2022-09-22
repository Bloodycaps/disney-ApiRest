package com.bloodycaps.disneyApiRest.persistence.mapper;

import com.bloodycaps.disneyApiRest.domain.dto.GenreDto;
import com.bloodycaps.disneyApiRest.persistence.entity.Genre;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MovieSerieMapper.class})
public interface GenreMapper {
    @Mappings({
            @Mapping(source = "idGenre", target = "genreId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "image", target = "image"),
            @Mapping(source = "idMovie", target = "movieId"),
            @Mapping(source = "movieSerie", target = "serieDto")
    })
    GenreDto toGenreDto(Genre genre);
    List<GenreDto> toGenreDtos(List<Genre> genres);

    @InheritInverseConfiguration
    Genre toGenre(GenreDto genreDto);
}
