package com.app.demo.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeEmployee ;
    private String name ;
    @ManyToOne
    @JoinColumn(name = "code_employeeSup")
    private Employee employeeSup;
    @ManyToMany
    @JoinTable(name = "employeeGroup" ,joinColumns = @JoinColumn(name="code_employee"),inverseJoinColumns = @JoinColumn(name="code_group"))
    private Collection<GroupEmployee> groupEmployees;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Long getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(Long codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
