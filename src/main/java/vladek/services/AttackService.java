package vladek.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vladek.models.Attack;
import vladek.models.Character;
import vladek.repositories.AttackRepository;
import vladek.services.interfaces.IAttackService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttackService implements IAttackService {
    private final AttackRepository repository;

    @Override
    public List<Attack> getAttacksByCharacter(Long characterId) {
        return repository.findByCharacter_Id(characterId);
    }

    @Override
    public Attack createAttack(Character character) {
        Attack attack = new Attack();
        attack.setCharacter(character);
        return repository.save(attack);
    }

    @Override
    public void deleteAttackById(Long attackId) {
        repository.deleteById(attackId);
    }

    @Override
    public Attack updateAttack(Attack attack) {
        return repository.save(attack);
    }
}
