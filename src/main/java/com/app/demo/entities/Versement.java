package com.app.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {
    public Versement() {
    }

    public Versement(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }
}
