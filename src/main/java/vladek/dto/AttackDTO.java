package vladek.dto;

import lombok.Data;
import vladek.models.Ability;
import vladek.models.Character;

@Data
public class AttackDTO {
    private Long id;
    private String name;
    private boolean proficiency;
    private int proficiencyBonus;
    private Ability ability;
    private int abilityBonus;
    private String damage;
    private int additionalBonus;
    private Character character;
}
