package com.example.service;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Метод для получения всех людей по городу
    public List<Person> getPersonsByCity(String city) {
        return personRepository.findByCityOfLiving(city);
    }

    // Метод для получения всех людей, чей возраст меньше заданного, отсортированные по возрасту
    public List<Person> getPersonsByAge(int age) {
        return personRepository.findByAgeLessThanOrderByAgeAsc(age);
    }

    // Метод для получения человека по имени и фамилии
    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return personRepository.findByNameAndSurname(name, surname);
    }
}