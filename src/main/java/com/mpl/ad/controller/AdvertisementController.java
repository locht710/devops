package com.mpl.ad.controller;

import com.mpl.ad.dto.AdvertisementDTO;
import com.mpl.ad.service.AdvertisementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ad")
public class AdvertisementController {
    private AdvertisementService advertisementService;

    @Autowired
    AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping
    public ResponseEntity getAllAd() {
        List<AdvertisementDTO> advertisementDTOS = advertisementService.getAllAd();
        return ResponseEntity.ok(advertisementDTOS);
    }
}
