package com.groupeisi.metier.service;

import com.groupeisi.metier.dto.FiliereDto;
import java.util.List;

public interface IFiliereService {
    FiliereDto get(int id);
    List<FiliereDto> getAll();
    boolean save(FiliereDto filiereDto);
}
