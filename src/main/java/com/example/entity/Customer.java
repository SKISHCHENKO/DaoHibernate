package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // id клиента

    private String name; // имя клиента

    private String surname; // фамилия клиента

    private int age; // возраст клиента

    @Column(name = "phone_number")
    private String phoneNumber; // номер телефона

    // Связь "один ко многим" с заказами
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders; // заказы, сделанные этим клиентом
}