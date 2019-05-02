package com.app.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {

    private double taux ;

    public CompteEpargne() {
    }

    public CompteEpargne(String codeCompte, Date dateCreation, double solde) {
        super(codeCompte, dateCreation, solde);
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
