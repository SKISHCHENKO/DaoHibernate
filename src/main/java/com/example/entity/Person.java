package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERSONS")
@IdClass(PersonId.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Id
    @Column(name = "surname", length = 50, nullable = false)
    private String surname;

    @Id
    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "city_of_living", length = 50)
    private String cityOfLiving;
}