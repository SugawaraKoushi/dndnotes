package vladek.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "attacks")
public class Attack {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name = "Настроить";

    @Column(nullable = false)
    private boolean proficiency;

    @Column(nullable = false)
    private int proficiencyBonus;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Ability ability = Ability.EMPTY;

    @Column(nullable = false, name = "ability_bonus")
    private int abilityBonus;

    @Column(nullable = false)
    private String damage = "1к6";

    @Column(nullable = false, name = "additional_bonus")
    private int additionalBonus;

    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;
}
