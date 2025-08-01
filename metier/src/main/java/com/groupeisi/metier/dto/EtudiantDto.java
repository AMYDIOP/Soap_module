package com.groupeisi.metier.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "etudiant")
@XmlAccessorType(XmlAccessType.FIELD)
public class EtudiantDto implements Serializable {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String dateNaissance;
    private int idFiliere;

    public EtudiantDto() {}

    public EtudiantDto(int id, String nom, String prenom, String email, String dateNaissance, int idFiliere) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.idFiliere = idFiliere;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(String dateNaissance) { this.dateNaissance = dateNaissance; }

    public int getIdFiliere() { return idFiliere; }
    public void setIdFiliere(int idFiliere) { this.idFiliere = idFiliere; }
}
