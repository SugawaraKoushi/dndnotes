package vladek.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vladek.models.Character;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {
}
