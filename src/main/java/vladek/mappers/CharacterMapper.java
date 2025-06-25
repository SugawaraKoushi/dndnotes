package vladek.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import vladek.dto.CharacterDTO;
import vladek.dto.CharacterShortDTO;
import vladek.models.Character;
import vladek.models.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacterMapper {
    CharacterShortDTO toShortDTO(Character character);

    @Mapping(target = "userId", source = "user", qualifiedByName = "userToUserId")
    CharacterDTO toDTO(Character character);

    @Mapping(target = "user", ignore = true)
    Character toEntity(CharacterDTO characterDTO);

    List<CharacterShortDTO> toShortDTOList(List<Character> characters);

    @Named("userToUserId")
    default Long userToUserId(User user) {
        return user.getId();
    }
}
