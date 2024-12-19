package com.example.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final EntityManager entityManager;

    // Конструктор для внедрения EntityManager
    public ProductRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Метод для выполнения SQL-запроса через EntityManager
    public String findProductNameByCustomerName(String name, String script) {
        //String jpql = "SELECT o.productName FROM Order o WHERE o.customer.name = :name";
        TypedQuery<String> query = entityManager.createQuery(script, String.class);
        //TypedQuery<String> query = entityManager.createQuery(jpql, String.class);
        query.setParameter("name", name);

        // Выполняем запрос и возвращаем результат
        return query.getSingleResult();
    }
}