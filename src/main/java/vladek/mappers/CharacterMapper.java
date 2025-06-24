package vladek.mappers;


import org.mapstruct.Mapper;
import vladek.dto.CharacterDTO;
import vladek.dto.CharacterShortDTO;
import vladek.models.Character;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacterMapper {
    CharacterShortDTO toShortDTO(Character character);

    CharacterDTO toDTO(Character character);

    List<CharacterShortDTO> toShortDTOList(List<Character> characters);
}
