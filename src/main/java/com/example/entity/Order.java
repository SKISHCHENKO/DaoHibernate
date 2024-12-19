package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // id заказа

    @Column(name = "date", nullable = false)
    private LocalDateTime date = LocalDateTime.now(); // дата заказа

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer; // связь с клиентом

    @Column(name = "product_name", length = 255)
    private String productName; // название продукта

    private int amount; // количество продукта
}