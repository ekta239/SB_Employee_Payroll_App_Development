package com.bridgelab.employeepayrollapp.model;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "employee_payroll")
public class EmployeePayRoll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private long salary;


    public EmployeePayRoll(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
}

