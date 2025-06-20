package vladek.mappers;

import org.mapstruct.Mapper;
import vladek.dto.AttackDTO;
import vladek.models.Attack;

@Mapper(componentModel = "spring")
public interface AttackMapper {
    AttackDTO toDTO(Attack attack);
}
