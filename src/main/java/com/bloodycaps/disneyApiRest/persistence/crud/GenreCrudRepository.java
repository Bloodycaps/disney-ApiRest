package com.bloodycaps.disneyApiRest.persistence.crud;

import com.bloodycaps.disneyApiRest.persistence.entity.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreCrudRepository extends CrudRepository<Genre, Integer> {
}
