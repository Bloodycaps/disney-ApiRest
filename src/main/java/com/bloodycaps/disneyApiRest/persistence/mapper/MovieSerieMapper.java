package com.bloodycaps.disneyApiRest.persistence.mapper;

import com.bloodycaps.disneyApiRest.domain.dto.MovieSerieDto;
import com.bloodycaps.disneyApiRest.persistence.entity.MovieSerie;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface MovieSerieMapper {
    @Mappings({
            @Mapping(source = "idMovieSerie",target = "movieId"),
            @Mapping(source = "title",target = "title"),
            @Mapping(source = "image",target = "image"),
            @Mapping(source = "creationDate",target = "creationDate"),
            @Mapping(source = "rate",target = "rate")
    })
    MovieSerieDto toMovieSerieDto(MovieSerie movieSerie);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "genres", ignore = true),
            @Mapping(target = "characters", ignore = true)
    })
    MovieSerie toMovieSerie(MovieSerieDto movieSerieDto);

}
