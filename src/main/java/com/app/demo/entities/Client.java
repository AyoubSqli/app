package com.app.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "Client")
@DiscriminatorValue("CL")
public class Client extends User implements Serializable {
    private String adresse ;
    @OneToMany(mappedBy = "client")
    private Collection<Compte> comptes ;

    public Client() {
    }
    public Client( String adresse ) {
        this.adresse = adresse;
    }

    public Client(String username, String password, String email, String name, String adresse) {
        super(username, password, email, name);
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}
