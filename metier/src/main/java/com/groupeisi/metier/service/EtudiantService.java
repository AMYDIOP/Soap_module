package com.groupeisi.metier.service;


import com.groupeisi.metier.dao.EtudiantDao;
import com.groupeisi.metier.dao.FiliereDao;
import com.groupeisi.metier.dao.IEtudiantDao;
import com.groupeisi.metier.dao.IFiliereDao;
import com.groupeisi.metier.dto.EtudiantDto;
import com.groupeisi.metier.entity.EtudiantEntity;
import com.groupeisi.metier.entity.FiliereEntity;
import com.groupeisi.metier.mapper.EtudiantMapper;

import java.util.List;

public class EtudiantService implements IEtudiantService {

    private final IEtudiantDao etudiantDao = new EtudiantDao();
    private final IFiliereDao filiereDao = new FiliereDao(); // pour récupérer FiliereEntity via ID

    @Override
    public List<EtudiantDto> getAll() {
        return EtudiantMapper.listEtudiantEntityToDto(etudiantDao.list(new EtudiantEntity()));
    }

    @Override
    public EtudiantDto get(int id) {
        return EtudiantMapper.toEtudiantDto(etudiantDao.get(id, new EtudiantEntity()));
    }

    @Override
    public boolean delete(int id) {
        return etudiantDao.delete(id, new EtudiantEntity());
    }

    @Override
    public boolean save(EtudiantDto dto) {
        FiliereEntity filiere = filiereDao.get(dto.getIdFiliere(), new FiliereEntity());
        return etudiantDao.save(EtudiantMapper.toEtudiantEntity(dto, filiere));
    }

    @Override
    public boolean update(EtudiantDto dto) {
        FiliereEntity filiere = filiereDao.get(dto.getIdFiliere(), new FiliereEntity());
        return etudiantDao.update(EtudiantMapper.toEtudiantEntity(dto, filiere));
    }
}
