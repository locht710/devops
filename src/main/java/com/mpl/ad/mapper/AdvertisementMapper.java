package com.mpl.ad.mapper;

import com.mpl.ad.dto.AdvertisementDTO;
import com.mpl.ad.model.Advertisement;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AdvertisementMapper {
    AdvertisementMapper MAPPER = Mappers.getMapper(AdvertisementMapper.class);

    Advertisement dtoToEntity(AdvertisementDTO advertisementDTO);

    AdvertisementDTO entityToDto(Advertisement advertisement);

    List<Advertisement> dtoToEntityList(List<AdvertisementDTO> advertisementDTOS);

    List<AdvertisementDTO> entityToDtoList(List<Advertisement> advertisements);
}
