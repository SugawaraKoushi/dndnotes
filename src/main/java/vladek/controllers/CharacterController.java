package vladek.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vladek.dto.CharacterDTO;
import vladek.dto.CharacterShortDTO;
import vladek.mappers.CharacterMapper;
import vladek.models.Character;
import vladek.models.User;
import vladek.services.interfaces.ICharacterService;
import vladek.services.interfaces.IUserService;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharacterController {
    private final ICharacterService characterService;
    private final IUserService userService;
    private final CharacterMapper characterMapper;

    @GetMapping("/list")
    public ResponseEntity<List<CharacterShortDTO>> getUserCharacters() {
        User user = userService.getCurrentUser();

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        List<Character> characters = characterService.getUserCharacters(user.getId());
        List<CharacterShortDTO> characterListItems = characterMapper.toShortDTOList(characters);
        return new ResponseEntity<>(characterListItems, HttpStatus.OK);
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterDTO> getCharacterById(@PathVariable Long characterId) {
        Character character = characterService.getCharacterById(characterId);

        if (character == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        User characterUser = userService.getUserById(character.getUser().getId());
        User currentUser = userService.getCurrentUser();

        if (!Objects.equals(characterUser.getId(), currentUser.getId())) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        CharacterDTO dto = characterMapper.toDTO(character);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<CharacterDTO> createCharacter() {
        User user = userService.getCurrentUser();

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        Character character = characterService.createCharacter(user);
        CharacterDTO dto = characterMapper.toDTO(character);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{characterId}")
    public ResponseEntity<Void> deleteCharacterById(@PathVariable Long characterId) {
        characterService.deleteCharacterById(characterId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<CharacterDTO> updateCharacter(@RequestBody CharacterDTO characterDTO) {
        User user = userService.getUserById(characterDTO.getUserId());
        Character character = characterMapper.toEntity(characterDTO);
        character.setUser(user);
        Character updatedCharacter = characterService.updateCharacter(character);
        CharacterDTO dto = characterMapper.toDTO(updatedCharacter);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
