package com.groupeisi.metier.entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "filiere")
public class FiliereEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code", length = 50, nullable = false, unique = true)
    private String code;

    @Column(name = "intitule", length = 250, nullable = false)
    private String intitule;

    public FiliereEntity() {
        super();
    }

    public FiliereEntity(int id, String code, String intitule) {
        this.id = id;
        this.code = code;
        this.intitule = intitule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
