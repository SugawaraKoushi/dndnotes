package vladek.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vladek.models.Character;
import vladek.repositories.CharacterRepository;
import vladek.services.interfaces.ICharacterService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService implements ICharacterService {
    private final CharacterRepository repository;

    @Override
    public List<Character> getUserCharacter(long userId) {
        return repository.findByUser_Id(userId);
    }
}
