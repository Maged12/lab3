package com.cs545.lab3.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

    @Id
    private Long id;
    private String name;
    private String description;
    private String location;

    @OneToMany(mappedBy = "department")
    private List<Employee> employee;
}
