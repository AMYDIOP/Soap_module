package com.groupeisi.metier.service;


import com.groupeisi.metier.dto.EtudiantDto;

import java.util.List;

public interface IEtudiantService {
    List<EtudiantDto> getAll();
    EtudiantDto get(int id);
    boolean delete(int id);
    boolean save(EtudiantDto etudiantDto);
    boolean update(EtudiantDto etudiantDto);
}
