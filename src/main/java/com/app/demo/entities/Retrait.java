package com.app.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {

    public Retrait() {
    }

    public Retrait(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }
}
