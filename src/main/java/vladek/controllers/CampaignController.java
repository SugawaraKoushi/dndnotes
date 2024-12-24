package vladek.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vladek.models.Campaign;
import vladek.services.CampaignService;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {
    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Campaign>> getAll() {
        List<Campaign> campaigns =  campaignService.getAll();
        return new ResponseEntity<>(campaigns, HttpStatus.OK);
    }
}
