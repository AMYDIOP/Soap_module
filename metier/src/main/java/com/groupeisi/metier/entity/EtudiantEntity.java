package com.groupeisi.metier.entity;

import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@Table(name = "etudiant")
public class EtudiantEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false, length = 100)
    private String prenom;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(name = "date_naissance", nullable = false)
    private String dateNaissance;

    @ManyToOne
    @JoinColumn(name = "id_filiere", nullable = false)
    private FiliereEntity filiere;

    public EtudiantEntity() {}

    public EtudiantEntity(int id, String nom, String prenom, String email, String dateNaissance, FiliereEntity filiere) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
    }

    // Getters / Setters
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

    public FiliereEntity getFiliere() { return filiere; }
    public void setFiliere(FiliereEntity filiere) { this.filiere = filiere; }
}
