package com.example.employee.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "salary")
    private int salary;

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "companyId")
    private int companyId;

    public Employee() {
    }

    public Employee(String name, int age, String gender, int salary, int id, int companyId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.id = id;
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getCompanyId() {
        return companyId;
    }
}
