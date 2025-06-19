package vladek.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vladek.models.Character;
import vladek.services.interfaces.ICharacterService;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharactersController {
    private final ICharacterService characterService;

    @GetMapping("/user/{id}/characters")
    public ResponseEntity<List<Character>> getUserCharacters(@PathVariable long id) {
        List<Character> characters = characterService.getUserCharacter(id);
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }
}
