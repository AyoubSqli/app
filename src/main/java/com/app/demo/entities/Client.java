package com.app.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "Client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClient ;
    private String nom ;
    private String adresse ;
    @OneToMany(mappedBy = "client")
    private Collection<Compte> comptes ;

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Client() {
    }
    public Client(String nom, String adresse ) {
        this.adresse = adresse;
        this.nom = nom;
    }

    public Long getcodeClient() {
        return codeClient;
    }

    public void setcodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
