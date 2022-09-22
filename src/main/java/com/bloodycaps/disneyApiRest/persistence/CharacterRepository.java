package com.bloodycaps.disneyApiRest.persistence;

import com.bloodycaps.disneyApiRest.persistence.crud.CharacterCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CharacterRepository {
    private CharacterCrudRepository characterCrudRepository;

    public List<Character> getAll() {
        return (List<Character>) characterCrudRepository.findAll();
    }

    public Optional<Character> getCharacter(int idCharacter) {
        return characterCrudRepository.findById(idCharacter);
    }

    public Character save(Character character) {
        return characterCrudRepository.save(character);
    }

    public void delete(int idCharacter) {
        characterCrudRepository.deleteById(idCharacter);
    }
}
