package vladek.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vladek.models.Campaign;
import vladek.services.CampaignService;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
@RequiredArgsConstructor
public class CampaignController {
    private final CampaignService campaignService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Campaign campaign) {
        campaignService.create(campaign);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Campaign>> getAll() {

        List<Campaign> campaigns = campaignService.getAll();
        return new ResponseEntity<>(campaigns, HttpStatus.OK);
    }
}
