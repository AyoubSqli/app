package com.app.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Compte",discriminatorType = DiscriminatorType.STRING,length = 2)
public class Compte implements Serializable {

    @Id
    private String codeCompte;
    private Date dateCreation ;
    private double solde ;
    @ManyToOne
    @JoinColumn(name="code_Client")
    private Client client ;
    @ManyToOne
    @JoinColumn(name="code_employee")
    private Employee employee ;
    @OneToMany(mappedBy = "compte")
    private Collection<Operation> Operations ;

    public Compte() {
    }

    public Compte(String codeCompte, Date dateCreation, double solde) {
        this.codeCompte = codeCompte;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }

    public String getCodeCompte() {
        return codeCompte;
    }

    public void setCodeCompte(String codeCompte) {
        this.codeCompte = codeCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Collection<Operation> getOperations() {
        return Operations;
    }

    public void setOperations(Collection<Operation> operations) {
        Operations = operations;
    }
}
