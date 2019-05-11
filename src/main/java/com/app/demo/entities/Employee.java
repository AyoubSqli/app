package com.app.demo.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@DiscriminatorValue("EM")
public class Employee extends User implements Serializable {
    @ManyToOne
    @JoinColumn(name = "code_employeeSup")
    private Employee employeeSup;
    @ManyToMany
    @JoinTable(name = "employeeGroup" ,joinColumns = @JoinColumn(name="code_employee"),inverseJoinColumns = @JoinColumn(name="code_group"))
    private Collection<GroupEmployee> groupEmployees;

    public Employee() {
    }

    public Employee(Employee employeeSup) {
        this.employeeSup = employeeSup;
    }

    public Employee(String username, String password, String email, String name, Employee employeeSup) {
        super(username, password, email, name);
        this.employeeSup = employeeSup;
    }

    public Employee getEmployeeSup() {
        return employeeSup;
    }

    public void setEmployeeSup(Employee employeeSup) {
        this.employeeSup = employeeSup;
    }

    public Collection<GroupEmployee> getGroupEmployees() {
        return groupEmployees;
    }

    public void setGroupEmployees(Collection<GroupEmployee> groupEmployees) {
        this.groupEmployees = groupEmployees;
    }
}
