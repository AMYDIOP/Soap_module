package com.groupeisi.metier.service;

import com.groupeisi.metier.dto.FiliereDto;

import java.util.ArrayList;
import java.util.List;

public class FiliereService implements IFiliereService {

    // Exemple avec une liste simulée
    private List<FiliereDto> filieres = new ArrayList<>();

    @Override
    public FiliereDto get(int id) {
        return filieres.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<FiliereDto> getAll() {
        return filieres;
    }

    @Override
    public boolean save(FiliereDto filiereDto) {
        filieres.add(filiereDto);
        return true;
    }
}
