package vladek.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@Table(name = "characters")
@ToString(exclude = {"user", "attacks"})
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private int level = 1;

    @Column(nullable = false)
    private String name = "Безымянный персонаж";

    @Column(nullable = false)
    private String race = "Человек";

    @Column(nullable = false, name = "class_name")
    private String className = "Воин";

    @Column(nullable = false)
    private String subclass = "Герой";

    @Column(nullable = false)
    private int speed = 30;

    @Column(nullable = false, name = "armor_class")
    private int armorClass = 10;

    @Column(nullable = false, name = "max_hp")
    private int maxHP = 20;

    @Column(nullable = false, name = "current_hp")
    private int currentHP = 20;

    @Column(nullable = false, name = "temporary_hp")
    private int temporaryHP;

    @Column(nullable = false)
    private int strength = 10;

    @Column(nullable = false)
    private int dexterity = 10;

    @Column(nullable = false)
    private int constitution = 10;

    @Column(nullable = false)
    private int intelligence = 10;

    @Column(nullable = false)
    private int wisdom = 10;

    @Column(nullable = false)
    private int charisma = 10;

    @Column(nullable = false)
    private int initiative;

    @Column(nullable = false)
    private boolean inspiration;

    @Column(nullable = false, name = "proficiency_bonus")
    private int proficiencyBonus = 2;

    // Спасброски
    @Column(nullable = false, name = "strength_saving_throw")
    private int strengthSavingThrow;

    @Column(nullable = false, name = "dexterity_saving_throw")
    private int dexteritySavingThrow;

    @Column(nullable = false, name = "constitution_saving_throw")
    private int constitutionSavingThrow;

    @Column(nullable = false, name = "intelligence_saving_throw")
    private int intelligenceSavingThrow;

    @Column(nullable = false, name = "wisdom_saving_throw")
    private int wisdomSavingThrow;

    @Column(nullable = false, name = "charisma_saving_throw")
    private int charismaSavingThrow;

    @Column(nullable = false, name = "strength_saving_throw_bonus")
    private int strengthSavingThrowBonus;

    @Column(nullable = false, name = "dexterity_saving_throw_bonus")
    private int dexteritySavingThrowBonus;

    @Column(nullable = false, name = "constitution_saving_throw_bonus")
    private int constitutionSavingThrowBonus;

    @Column(nullable = false, name = "intelligence_saving_throw_bonus")
    private int intelligenceSavingThrowBonus;

    @Column(nullable = false, name = "wisdom_saving_throw_bonus")
    private int wisdomSavingThrowBonus;

    @Column(nullable = false, name = "charisma_saving_throw_bonus")
    private int charismaSavingThrowBonus;

    // Владение спасбросками
    @Column(nullable = false, name = "strength_saving_throw_proficiency")
    private boolean strengthSavingThrowProficiency;

    @Column(nullable = false, name = "dexterity_saving_throw_proficiency")
    private boolean dexteritySavingThrowProficiency;

    @Column(nullable = false, name = "constitution_saving_throw_proficiency")
    private boolean constitutionSavingThrowProficiency;

    @Column(nullable = false, name = "intelligence_saving_throw_proficiency")
    private boolean intelligenceSavingThrowProficiency;

    @Column(nullable = false, name = "wisdom_saving_throw_proficiency")
    private boolean wisdomSavingThrowProficiency;

    @Column(nullable = false, name = "charisma_saving_throw_proficiency")
    private boolean charismaSavingThrowProficiency;

    // Навыки
    @Column(nullable = false)
    private int athletics; // Атлетика

    @Column(nullable = false)
    private int acrobatics; // Акробатика

    @Column(nullable = false, name = "sleight_of_hand")
    private int sleightOfHand; // Ловкость рук

    @Column(nullable = false)
    private int stealth; // Скрытность

    @Column(nullable = false)
    private int arcana; // Магия

    @Column(nullable = false)
    private int history; // История

    @Column(nullable = false)
    private int investigation; // Анализ

    @Column(nullable = false)
    private int nature; // Природа

    @Column(nullable = false)
    private int religion; // Религия

    @Column(nullable = false, name = "animal_handling")
    private int animalHandling; // Уход за животными

    @Column(nullable = false)
    private int insight; // Проницательность

    @Column(nullable = false)
    private int medicine; // Медицина

    @Column(nullable = false)
    private int perception; // Восприятие

    @Column(nullable = false)
    private int survival; // Выживание

    @Column(nullable = false)
    private int deception; // Обман

    @Column(nullable = false)
    private int intimidation; // Запугивание

    @Column(nullable = false)
    private int performance; // Выступление

    @Column(nullable = false)
    private int persuasion; // Убеждение

    // Владение навыками
    @Column(nullable = false, name = "athletics_proficiency")
    private boolean athleticsProficiency; // Атлетика

    @Column(nullable = false, name = "acrobatics_proficiency")
    private boolean acrobaticsProficiency; // Акробатика

    @Column(nullable = false, name = "sleight_of_hand_proficiency")
    private boolean sleightOfHandProficiency;  // Ловкость рук

    @Column(nullable = false, name = "stealth_proficiency")
    private boolean stealthProficiency; // Скрытность

    @Column(nullable = false, name = "arcana_proficiency")
    private boolean arcanaProficiency; // Магия

    @Column(nullable = false, name = "history_proficiency")
    private boolean historyProficiency; // История

    @Column(nullable = false, name = "investigation_proficiency")
    private boolean investigationProficiency; // Анализ

    @Column(nullable = false, name = "nature_proficiency")
    private boolean natureProficiency; // Природа

    @Column(nullable = false, name = "religion_proficiency")
    private boolean religionProficiency; // Религия

    @Column(nullable = false, name = "animal_handling_proficiency")
    private boolean animalHandlingProficiency;  // Уход за животными

    @Column(nullable = false, name = "insight_proficiency")
    private boolean insightProficiency; // Проницательность

    @Column(nullable = false, name = "medicine_proficiency")
    private boolean medicineProficiency; // Медицина

    @Column(nullable = false, name = "perception_proficiency")
    private boolean perceptionProficiency; // Внимательность

    @Column(nullable = false, name = "survival_proficiency")
    private boolean survivalProficiency; // Выживание

    @Column(nullable = false, name = "deception_proficiency")
    private boolean deceptionProficiency; // Обман

    @Column(nullable = false, name = "intimidation_proficiency")
    private boolean intimidationProficiency; // Запугивание

    @Column(nullable = false, name = "performance_proficiency")
    private boolean performanceProficiency; // Выступление

    @Column(nullable = false, name = "persuasion_proficiency")
    private boolean persuasionProficiency; // Убеждение

    // Бонусы к навыкам
    @Column(nullable = false, name = "athletic_bonus")
    private int athleticsBonus; // Атлетика

    @Column(nullable = false, name = "acrobatics_bonus")
    private int acrobaticsBonus; // Акробатика

    @Column(nullable = false, name = "sleight_of_hand_bonus")
    private int sleightOfHandBonus; // Ловкость рук

    @Column(nullable = false, name = "stealth_bonus")
    private int stealthBonus; // Скрытность

    @Column(nullable = false, name = "arcana_bonus")
    private int arcanaBonus; // Магия

    @Column(nullable = false, name = "history_bonus")
    private int historyBonus; // История

    @Column(nullable = false, name = "investigation_bonus")
    private int investigationBonus; // Анализ

    @Column(nullable = false, name = "nature_bonus")
    private int natureBonus; // Природа

    @Column(nullable = false, name = "religion_bonus")
    private int religionBonus; // Религия

    @Column(nullable = false, name = "animal_handling_bonus")
    private int animalHandlingBonus; // Уход за животными

    @Column(nullable = false, name = "insight_bonus")
    private int insightBonus; // Проницательность

    @Column(nullable = false, name = "medicine_bonus")
    private int medicineBonus; // Медицина

    @Column(nullable = false, name = "perception_bonus")
    private int perceptionBonus; // Восприятие

    @Column(nullable = false, name = "survival_bonus")
    private int survivalBonus; // Выживание

    @Column(nullable = false, name = "deception_bonus")
    private int deceptionBonus; // Обман

    @Column(nullable = false, name = "intimidation_bonus")
    private int intimidationBonus; // Запугивание

    @Column(nullable = false, name = "performance_bonus")
    private int performanceBonus; // Выступление

    @Column(nullable = false, name = "persuasion_bonus")
    private int persuasionBonus; // Убеждение

    // Пассивные чувства
    @Column(nullable = false, name = "perception_passive")
    private int perceptionPassive = 10;

    @Column(nullable = false, name = "insight_passive")
    private int insightPassive = 10;

    @Column(nullable = false, name = "investigation_passive")
    private int investigationPassive = 10;

    // Состояния
    @Column(nullable = false)
    private int exhausted; // Истощение

    @Column(nullable = false)
    private boolean unconscious; // Бессознательный

    @Column(nullable = false)
    private boolean frightened; // Испуганный

    @Column(nullable = false)
    private boolean exhaustion; // Истощенный

    @Column(nullable = false)
    private boolean invisible; // Невидимый

    @Column(nullable = false)
    private boolean incapacitated; // Недееспособный

    @Column(nullable = false)
    private boolean deafened; // Оглохший

    @Column(nullable = false)
    private boolean petrified; // Окаменевший

    @Column(nullable = false)
    private boolean restrained; // Опутанный

    @Column(nullable = false)
    private boolean blinded; // Ослеплённый

    @Column(nullable = false)
    private boolean poisoned; // Отравленный

    @Column(nullable = false)
    private boolean charmed; // Очарованный

    @Column(nullable = false)
    private boolean stunned; // Ошеломлённый

    @Column(nullable = false)
    private boolean paralyzed; // Парализованный

    @Column(nullable = false)
    private boolean prone; // Сбитый с ног

    @Column(nullable = false)
    private boolean grappled; // Схваченный

    @Column(name = "notes")
    private String notes;

    @Column(name = "languages")
    private String languages;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "character", cascade = CascadeType.REMOVE)
    private List<Attack> attacks;

    @Column(name = "avatar_link")
    private String avatarLink;
}