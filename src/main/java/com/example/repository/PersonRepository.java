package com.example.repository;

import com.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    // Метод для поиска людей по городу
    List<Person> findByCityOfLiving(String city);

    // Метод для поиска людей по возрасту, сортированных по возрастанию
    List<Person> findByAgeLessThanOrderByAgeAsc(int age);

    // Метод для поиска человека по имени и фамилии с использованием Optional
    Optional<Person> findByNameAndSurname(String name, String surname);
}