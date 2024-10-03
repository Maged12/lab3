package com.cs545.lab3.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

    @ManyToOne
    private Department department;
}
