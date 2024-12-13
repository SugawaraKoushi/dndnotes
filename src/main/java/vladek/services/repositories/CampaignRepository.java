package vladek.services.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vladek.models.Campaign;

@Repository
public interface CampaignRepository extends CrudRepository<Campaign, Integer> {
}
