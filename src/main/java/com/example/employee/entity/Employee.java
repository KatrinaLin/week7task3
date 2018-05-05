package com.example.employee.entity;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private int id;
    private int companyId;

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
