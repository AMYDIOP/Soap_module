package com.groupeisi.metier.mapper;

import com.groupeisi.metier.dto.FiliereDto;
import com.groupeisi.metier.entity.FiliereEntity;

import java.util.List;
import java.util.stream.Collectors;

public class FiliereMapper {

    public static List<FiliereDto> listFiliereEntityToListFiliereDto(List<FiliereEntity> filieres) {
        return filieres.stream()
                .map(FiliereMapper::toFiliereDto)
                .collect(Collectors.toList());
    }

    public static FiliereDto toFiliereDto(FiliereEntity f) {
        return new FiliereDto(
                f.getId(),
                f.getCode(),
                f.getIntitule()
        );
    }

    public static FiliereEntity toFiliereEntity(FiliereDto dto) {
        return new FiliereEntity(
                dto.getId(),
                dto.getCode(),
                dto.getIntitule()
        );
    }
}
