package com.app.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class GroupEmployee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeGroup ;
    private String nomGroup ;
    @ManyToMany(mappedBy = "groupEmployees")
    private Collection<Employee> employees ;

    public GroupEmployee() {
    }

    public GroupEmployee(String nomGroup) {
        this.nomGroup = nomGroup;
    }

    public Long getCodeGroup() {
        return codeGroup;
    }

    public void setCodeGroup(Long codeGroup) {
        this.codeGroup = codeGroup;
    }

    public String getNomGroup() {
        return nomGroup;
    }

    public void setNomGroup(String nomGroup) {
        this.nomGroup = nomGroup;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
}
