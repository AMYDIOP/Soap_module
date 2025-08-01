package com.groupeisi.metier.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "filiere")
@XmlAccessorType(XmlAccessType.FIELD)
public class FiliereDto implements Serializable {

    private int id;
    private String code;
    private String intitule;

    public FiliereDto() {}

    public FiliereDto(int id, String code, String intitule) {
        this.id = id;
        this.code = code;
        this.intitule = intitule;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getIntitule() { return intitule; }
    public void setIntitule(String intitule) { this.intitule = intitule; }
}
