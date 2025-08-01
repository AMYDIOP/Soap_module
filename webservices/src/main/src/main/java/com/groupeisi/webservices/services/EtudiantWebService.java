package com.groupeisi.webservices.services;


import com.groupeisi.metier.dto.EtudiantDto;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;
@WebService(serviceName = "EtudiantWebService")

public interface EtudiantWebService {

    @WebMethod(operationName = "getEtudiant")
    EtudiantDto get(@WebParam(name = "id") int id);

    @WebMethod(operationName = "allEtudiants")
    List<EtudiantDto> all();

    @WebMethod(operationName = "saveEtudiant")
    EtudiantDto save(@WebParam(name = "etudiant") EtudiantDto etudiantDto);



}


