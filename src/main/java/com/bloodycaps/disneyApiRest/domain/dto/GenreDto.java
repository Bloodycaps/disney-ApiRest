package com.bloodycaps.disneyApiRest.domain.dto;

public class GenreDto {
    private int genreId;
    private String name;
    private String image;
    private int movieId;
    private MovieSerieDto serieDto;

    public MovieSerieDto getSerieDto() {
        return serieDto;
    }

    public void setSerieDto(MovieSerieDto serieDto) {
        this.serieDto = serieDto;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
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

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
