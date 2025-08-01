package com.groupeisi.metier.mapper;

import com.groupeisi.metier.dto.EtudiantDto;
import com.groupeisi.metier.entity.EtudiantEntity;
import com.groupeisi.metier.entity.FiliereEntity;

import java.util.List;
import java.util.stream.Collectors;

public class EtudiantMapper {

    public static List<EtudiantDto> listEtudiantEntityToDto(List<EtudiantEntity> etudiants) {
        return etudiants.stream()
                .map(EtudiantMapper::toEtudiantDto)
                .collect(Collectors.toList());
    }

    public static EtudiantDto toEtudiantDto(EtudiantEntity e) {
        return new EtudiantDto(
                e.getId(),
                e.getNom(),
                e.getPrenom(),
                e.getEmail(),
                e.getDateNaissance(),
                e.getFiliere().getId() // clé étrangère
        );
    }

    public static EtudiantEntity toEtudiantEntity(EtudiantDto dto, FiliereEntity filiere) {
        return new EtudiantEntity(
                dto.getId(),
                dto.getNom(),
                dto.getPrenom(),
                dto.getEmail(),
                dto.getDateNaissance(),
                filiere // ici on passe l'objet FiliereEntity déjà récupéré
        );
    }
}
