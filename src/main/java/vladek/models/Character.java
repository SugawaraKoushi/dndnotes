package vladek.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "default '1'")
    private int level;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Sex sex;

    private String className;

    // Очки здоровья
    private int healthPoints;
    private int currentHP;
    private int temporaryHP;

    // Основные характеристики
    @Column(nullable = false, columnDefinition = "default '10'")
    private int strength;

    @Column(nullable = false, columnDefinition = "default '10'")
    private int dexterity;

    @Column(nullable = false, columnDefinition = "default '10'")
    private int constitution;

    @Column(nullable = false, columnDefinition = "default '10'")
    private int intelligence;

    @Column(nullable = false, columnDefinition = "default '10'")
    private int wisdom;

    @Column(nullable = false, columnDefinition = "default '10'")
    private int charisma;

    // Владение спасбросками
    @Column(name = "strength_mastery", nullable = false, columnDefinition = "default 'false'")
    private boolean strengthMastery;

    @Column(name = "dexterity_mastery", nullable = false, columnDefinition = "default 'false'")
    private boolean dexterityMastery;

    @Column(name = "constitution_mastery", nullable = false, columnDefinition = "default 'false'")
    private boolean constitutionMastery;

    @Column(name = "intelligence_mastery", nullable = false, columnDefinition = "default 'false'")
    private boolean intelligenceMastery;

    @Column(name = "wisdom_mastery", nullable = false, columnDefinition = "default 'false'")
    private boolean wisdomMastery;

    @Column(name = "charisma_mastery", nullable = false, columnDefinition = "default 'false'")
    private boolean charismaMastery;

    // Владение навыками
    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency athletic;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency acrobatics;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency sleightOfHand;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency stealth;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency history;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency arcane;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency nature;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency investigation;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency religion;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency perception;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency survival;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency medicine;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency insight;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency animalHandling;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency performance;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency intimidation;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency deception;

    @Column(nullable = false, columnDefinition = "default '0'")
    @Enumerated(EnumType.ORDINAL)
    private SkillProficiency persuasion;

    // Остальные характеристики
    @Enumerated(EnumType.ORDINAL)
    private Alignment alignment;

    private int height;
    private int weight;
    private int age;
    private String eyes;
    private String skin;
    private String hair;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
}