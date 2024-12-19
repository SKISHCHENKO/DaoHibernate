package com.example.service;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return personRepository.findPersonsByCity(city);
    }

    public List<Person> getPersonsByAge(int age) {
        return personRepository.findPersonsByAgeLessThan(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return personRepository.findPersonByNameAndSurname(name, surname);
    }
}