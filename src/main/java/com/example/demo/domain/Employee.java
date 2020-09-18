package com.example.demo.domain;

public class Employee {

    public Employee() {

    }
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstname = firstName;
        this.lastname = lastName;
    }

    private int id;
    private String firstname;
    private String lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
