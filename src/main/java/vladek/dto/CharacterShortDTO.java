package vladek.dto;

import lombok.Data;

@Data
public class CharacterShortDTO {
    private Long id;
    private String name;
    private String className;
    private int currentHP;
    private int maxHP;
    private String avatarLink;
}
