package com.jmc.javafxmasteryclass;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {

    private final StringProperty name;
    private final IntegerProperty salary;

    public Employee(String name, int salary) {
        this.name = new SimpleStringProperty(name);
        this.salary = new SimpleIntegerProperty(salary);
    }

    public String getName() {
        return name.getValue();
    }

    public int getSalary() {
        return salary.get();
    }

    public IntegerProperty getSalaryProperty() {
        return salary;
    }

    public StringProperty getNameProperty() {
        return name;
    }

    public void setSalary(int newSalary) {
        this.salary.set(newSalary);
    }

//    private String name;
//    private int salary;
//
//    public Employee(String name, int salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public String getName() { return name; }
//
//    public void setName(String name) { this.name = name; }
//
//    public int getSalary() { return salary; }
//
//    public void setSalary(int salary) { this.salary = salary; }
}
