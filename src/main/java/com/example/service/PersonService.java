package com.example.service;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}