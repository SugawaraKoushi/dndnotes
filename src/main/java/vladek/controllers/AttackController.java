package vladek.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vladek.models.Attack;
import vladek.models.Character;
import vladek.services.interfaces.IAttackService;
import vladek.services.interfaces.ICharacterService;

import java.util.List;

@RestController
@RequestMapping("/api/attacks")
@RequiredArgsConstructor
public class AttackController {
    private final IAttackService attackService;
    private final ICharacterService characterService;

    @GetMapping("/character/{characterId}")
    public ResponseEntity<List<Attack>> getAttacksByCharacter(@PathVariable Long characterId) {
        List<Attack> attacks = attackService.getAttacksByCharacter(characterId);
        return new ResponseEntity<>(attacks, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Attack> createAttack(@RequestBody Long characterId) {
        Character character = characterService.getCharacterById(characterId);
        Attack attack = attackService.createAttack(character);
        return new ResponseEntity<>(attack, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{attackId}")
    public ResponseEntity<Void> deleteAttack(@PathVariable Long attackId) {
        attackService.deleteAttackById(attackId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Attack> updateAttack(@RequestBody Attack attack) {
        Attack updatedAttack = attackService.updateAttack(attack);
        return new ResponseEntity<>(updatedAttack, HttpStatus.OK);
    }
}
