package com.mpl.ad.service;

import com.mpl.ad.dto.AdvertisementDTO;
import com.mpl.ad.mapper.AdvertisementMapper;
import com.mpl.ad.repository.AdvertisementRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
    private AdvertisementRepository advertisementRepository;

    @Autowired
    AdvertisementServiceImpl(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    @Override
    public List<AdvertisementDTO> getAllAd() {
        return AdvertisementMapper.MAPPER.entityToDtoList(advertisementRepository.findAll());
    }
}
