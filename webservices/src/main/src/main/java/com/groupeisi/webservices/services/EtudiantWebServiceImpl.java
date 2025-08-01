package com.groupeisi.webservices.services;


import com.groupeisi.metier.dto.EtudiantDto;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


import java.util.ArrayList;
import java.util.List;
@WebService(endpointInterface = "com.groupeisi.webservices.services.EtudiantWebService")
public class EtudiantWebServiceImpl implements EtudiantWebService {

    @Override
    @WebMethod
    public EtudiantDto get(@WebParam(name = "id") int id) {
        return new EtudiantDto(); // retour vide juste pour test
    }

    @Override
    @WebMethod
    public List<EtudiantDto> all() {
        return new ArrayList<>();
    }


   @Override
    @WebMethod(operationName = "saveEtudiant")
    public EtudiantDto save(@WebParam(name = "etudiant") EtudiantDto etudiantDto) {
        return etudiantDto;
    }


}
