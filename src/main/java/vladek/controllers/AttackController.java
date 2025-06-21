package vladek.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vladek.dto.AttackDTO;
import vladek.mappers.AttackMapper;
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
    private final AttackMapper attackMapper;

    @GetMapping("/character/{characterId}")
    public ResponseEntity<List<AttackDTO>> getAttacksByCharacter(@PathVariable Long characterId) {
        List<Attack> attacks = attackService.getAttacksByCharacter(characterId);
        List<AttackDTO> dtos = attackMapper.toDTOList(attacks);
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<AttackDTO> createAttack(@RequestParam Long characterId) {
        Character character = characterService.getCharacterById(characterId);
        Attack attack = attackService.createAttack(character);
        AttackDTO dto = attackMapper.toDTO(attack);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{attackId}")
    public ResponseEntity<Void> deleteAttack(@PathVariable Long attackId) {
        attackService.deleteAttackById(attackId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<AttackDTO> updateAttack(@RequestBody AttackDTO attack) {
        Attack updatedAttack = attackMapper.toEntity(attack);
        Character character = characterService.getCharacterById(attack.getCharacterId());
        updatedAttack.setCharacter(character);

        updatedAttack = attackService.updateAttack(updatedAttack);
        AttackDTO updatedAttackDTO = attackMapper.toDTO(updatedAttack);
        return new ResponseEntity<>(updatedAttackDTO, HttpStatus.OK);
    }
}
