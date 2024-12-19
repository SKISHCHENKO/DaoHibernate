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
        TypedQuery<String> query = entityManager.createQuery(script, String.class);
        query.setParameter("name", name);

        // Выполняем запрос и возвращаем результат
        return query.getSingleResult();
    }
}