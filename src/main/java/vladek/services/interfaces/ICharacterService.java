package vladek.services.interfaces;

import vladek.models.Character;

import java.util.List;

public interface ICharacterService {
    List<Character> getUserCharacter(long id);
}
