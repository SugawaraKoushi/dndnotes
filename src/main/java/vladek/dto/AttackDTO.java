package vladek.dto;

import lombok.Data;

@Data
public class AttackDTO {
    private Long id;
    private String name;
    private boolean proficiency;
    private int proficiencyBonus;
    private int ability;
    private int abilityBonus;
    private String damage;
    private int additionalBonus;
    private Long characterId;
}
