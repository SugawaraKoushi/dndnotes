package vladek.services.interfaces;

import vladek.models.Campaign;

import java.util.List;

public interface ICampaignService {
    void create(Campaign campaign);
    List<Campaign> getAll();
}
