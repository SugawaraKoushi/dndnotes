package vladek.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vladek.dto.CharacterShortDTO;
import vladek.models.Character;
import vladek.models.User;
import vladek.repositories.CharacterRepository;
import vladek.services.interfaces.ICharacterService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService implements ICharacterService {
    private final CharacterRepository repository;

    @Override
    public List<Character> getUserCharacters(Long userId) {
        return repository.findByUser_Id(userId);
    }

    @Override
    public Character createCharacter(User user) {
        Character character = new Character();
        character.setUser(user);
        return repository.save(character);
    }

    @Override
    public Character getCharacterById(Long characterId) {
        return repository.findById(characterId).orElse(null);
    }

    @Override
    public void deleteCharacterById(Long characterId) {
        repository.deleteById(characterId);
    }

    @Override
    public Character updateCharacter(Character character) {
        return repository.save(character);
    }

    @Override
    public CharacterShortDTO toCharacterListItemDTO(Character character) {
        CharacterShortDTO dto = new CharacterShortDTO();
        dto.setId(character.getId());
        dto.setName(character.getName());
        dto.setClassName(character.getClassName());
        dto.setCurrentHP(character.getCurrentHP());
        dto.setMaxHP(character.getMaxHP());
        return dto;
    }
}
