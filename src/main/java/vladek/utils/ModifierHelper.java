package vladek.utils;

public class ModifierHelper {
    public static int calculateModifier(int abilityValue) {
        return (int) Math.floor((abilityValue - 10) / 2.0);
    }

    public static int calculateProficiencyBonus(int level) {
        return 2 + (int) Math.floor(level / 2.0);
    }
}
