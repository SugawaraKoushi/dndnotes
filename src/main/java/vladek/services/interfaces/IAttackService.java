package vladek.services.interfaces;

import vladek.models.Attack;
import vladek.models.Character;

import java.util.List;

public interface IAttackService {
    List<Attack> getAttacksByCharacter(Long characterId);

    Attack createAttack(Character character);

    void deleteAttackById(Long attackId);

    Attack updateAttack(Attack attack);
}
