package com.example.controller;

import com.example.entity.Person;
import com.example.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/city/{city}")
    public List<Person> getPersonsByCity(@PathVariable String city) {
        return personService.getPersonsByCity(city);
    }

    @GetMapping("/age/{age}")
    public List<Person> getPersonsByAge(@PathVariable int age) {
        return personService.getPersonsByAge(age);
    }

    @GetMapping("/name")
    public Optional<Person> getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return personService.getPersonByNameAndSurname(name, surname);
    }
}