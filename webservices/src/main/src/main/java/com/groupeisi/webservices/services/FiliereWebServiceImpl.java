package com.groupeisi.webservices.services;

import com.groupeisi.metier.dto.FiliereDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.groupeisi.webservices.services.FiliereWebService")
public class FiliereWebServiceImpl implements FiliereWebService {

    @Override
    @WebMethod
    public FiliereDto get(@WebParam(name = "id") int id) {
        return new FiliereDto(); // retour vide juste pour test
    }

    @Override
    @WebMethod
    public List<FiliereDto> all() {
        return new ArrayList<>();
    }

    @Override
    @WebMethod(operationName = "saveFiliere")
    public FiliereDto saveFiliere(@WebParam(name = "filiere") FiliereDto filiereDto) {
        return filiereDto;
    }
}
