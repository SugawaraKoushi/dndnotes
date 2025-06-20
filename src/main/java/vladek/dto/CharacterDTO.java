package vladek.dto;

import jakarta.persistence.*;
import lombok.Data;
import vladek.models.Attack;
import vladek.models.User;

import java.util.List;

@Data
public class CharacterDTO {
    private Long id;
    private int level;
    private String name;
    private String race;
    private String className ;
    private String subclass;
    private int speed;
    private int armorClass;
    private int maxHP;
    private int currentHP;
    private int temporaryHP;
    // характеристики
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    
    
    private int initiative;
    private boolean inspiration;
    private int proficiencyBonus;
    // Спасброски
    private int strengthSavingThrow;
    private int dexteritySavingThrow;
    private int constitutionSavingThrow;
    private int intelligenceSavingThrow;
    private int wisdomSavingThrow;
    private int charismaSavingThrow;
    // Владение спасбросками
    private boolean strengthSavingThrowProficiency;
    private boolean dexteritySavingThrowProficiency;
    private boolean constitutionSavingThrowProficiency;
    private boolean intelligenceSavingThrowProficiency;
    private boolean wisdomSavingThrowProficiency;
    private boolean charismaSavingThrowProficiency;
    // Навыки
    private int athletics; // Атлетика
    private int acrobatics; // Акробатика
    private int sleightOfHand; // Ловкость рук
    private int stealth; // Скрытность
    private int arcana; // Магия
    private int history; // История
    private int investigation; // Анализ
    private int nature; // Природа
    private int religion; // Религия
    private int animalHandling; // Уход за животными
    private int insight; // Проницательность
    private int medicine; // Медицина
    private int perception; // Восприятие
    private int survival; // Выживание
    private int deception; // Обман
    private int intimidation; // Запугивание
    private int performance; // Выступление
    private int persuasion; // Убеждение
    // Владение навыками
    private boolean athleticsProficiency; // Атлетика
    private boolean acrobaticsProficiency; // Акробатика
    private boolean sleightOfHandProficiency;  // Ловкость рук
    private boolean stealthProficiency; // Скрытность
    private boolean arcanaProficiency; // Магия
    private boolean historyProficiency; // История
    private boolean investigationProficiency; // Анализ
    private boolean natureProficiency; // Природа
    private boolean religionProficiency; // Религия
    private boolean animalHandlingProficiency;  // Уход за животными
    private boolean insightProficiency; // Проницательность
    private boolean medicineProficiency; // Медицина
    private boolean perceptionProficiency; // Внимательность
    private boolean survivalProficiency; // Выживание
    private boolean deceptionProficiency; // Обман
    private boolean intimidationProficiency; // Запугивание
    private boolean performanceProficiency; // Выступление
    private boolean persuasionProficiency; // Убеждение
    // Бонусы к навыкам
    private int athleticsBonus; // Атлетика
    private int acrobaticsBonus; // Акробатика
    private int sleightOfHandBonus; // Ловкость рук
    private int stealthBonus; // Скрытность
    private int arcanaBonus; // Магия
    private int historyBonus; // История
    private int investigationBonus; // Анализ
    private int natureBonus; // Природа
    private int religionBonus; // Религия
    private int animalHandlingBonus; // Уход за животными
    private int insightBonus; // Проницательность
    private int medicineBonus; // Медицина
    private int perceptionBonus; // Восприятие
    private int survivalBonus; // Выживание
    private int deceptionBonus; // Обман
    private int intimidationBonus; // Запугивание
    private int performanceBonus; // Выступление
    private int persuasionBonus; // Убеждение
    // Пассивные чувства
    private int perceptionPassive;
    private int insightPassive;
    private int investigationPassive;
    // Состояния
    private int exhausted; // Истощение
    private boolean unconscious; // Бессознательный
    private boolean frightened; // Испуганный
    private boolean exhaustion; // Истощенный
    private boolean invisible; // Невидимый
    private boolean incapacitated; // Недееспособный
    private boolean deafened; // Оглохший
    private boolean petrified; // Окаменевший
    private boolean restrained; // Опутанный
    private boolean blinded; // Ослеплённый
    private boolean poisoned; // Отравленный
    private boolean charmed; // Очарованный
    private boolean stunned; // Ошеломлённый
    private boolean paralyzed; // Парализованный
    private boolean prone; // Сбитый с ног
    private boolean grappled; // Схваченный
    private String note;
}
