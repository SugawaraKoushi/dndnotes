package vladek.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vladek.models.Campaign;
import vladek.services.interfaces.ICampaignService;
import vladek.services.repositories.CampaignRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignService implements ICampaignService {
    @Autowired
    private CampaignRepository repository;

    @Override
    public List<Campaign> getAll() {
        List<Campaign> campaigns = new ArrayList<>();
        repository.findAll().forEach(campaigns::add);
        return campaigns;
    }
}
