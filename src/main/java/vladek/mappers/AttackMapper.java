package vladek.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import vladek.dto.AttackDTO;
import vladek.models.Ability;
import vladek.models.Attack;
import vladek.models.Character;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AttackMapper {
    @Mapping(target = "ability", source = "ability", qualifiedByName = "abilityToOrdinal")
    @Mapping(target = "characterId", source = "character", qualifiedByName = "characterToCharacterId")
    AttackDTO toDTO(Attack attack);

    List<AttackDTO> toDTOList(List<Attack> attacks);

    @Mapping(target = "character", ignore = true)
    @Mapping(target = "ability", source = "ability", qualifiedByName = "ordinalToAbility")
    Attack toEntity(AttackDTO attackDTO);

    @Named("abilityToOrdinal")
    default int abilityToOrdinal(Ability ability) {
        return ability != null ? ability.ordinal() : Ability.EMPTY.ordinal();
    }

    @Named("ordinalToAbility")
    default Ability ordinalToAbility(int ordinal) {
        return Ability.values()[ordinal];
    }

    @Named("characterToCharacterId")
    default Long characterToCharacterId(Character character) {
        return character.getId();
    }
}
