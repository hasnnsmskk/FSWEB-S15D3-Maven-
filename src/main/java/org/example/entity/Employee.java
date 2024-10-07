package org.example.entity;

import java.util.*;

public class Employee {

    private int id;
    private String firstname;
    private String lastname;

    public Employee(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    // İki Employee nesnesinin id'lerinin aynı olup olmadığını kontrol eder.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    // Hashcode metodu, id'ye göre hash hesaplar. HashMap'lerde doğru çalışması için gerekli.
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}


