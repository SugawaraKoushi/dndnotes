package vladek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vladek.models.Attack;

import java.util.List;

public interface AttackRepository extends JpaRepository<Attack, Long> {
    List<Attack> findByCharacter_Id(Long characterId);
}
