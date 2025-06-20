package vladek.services.interfaces;

import vladek.dto.CharacterShortDTO;
import vladek.models.Character;
import vladek.models.User;

import java.util.List;

public interface ICharacterService {
    List<Character> getUserCharacters(Long userId);

    Character createCharacter(User user);

    Character getCharacterById(Long characterId);

    void deleteCharacterById(Long characterId);

    Character updateCharacter(Character character);

    CharacterShortDTO toCharacterListItemDTO(Character character);
}
