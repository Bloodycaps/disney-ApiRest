package com.bloodycaps.disneyApiRest.web.controller;

import com.bloodycaps.disneyApiRest.persistence.entity.Genre;
import com.bloodycaps.disneyApiRest.persistence.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping("")
    public List<Genre> getAll(){
        return genreService.getAll();
    }
}
