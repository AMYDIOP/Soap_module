package com.groupeisi.webservices.services;

import com.groupeisi.metier.dto.FiliereDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.List;
@WebService
public interface FiliereWebService {
    @WebMethod(operationName = "getFiliere")
    FiliereDto get(@WebParam(name = "id") int id);

     @WebMethod(operationName = "allFilieres")
    List<FiliereDto> all();

    @WebMethod(operationName = "saveFiliere")
    FiliereDto saveFiliere(@WebParam(name = "filiere") FiliereDto filiereDto);
}


