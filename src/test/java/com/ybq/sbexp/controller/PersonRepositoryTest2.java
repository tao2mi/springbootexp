package com.ybq.sbexp.controller;

import com.ybq.sbexp.dao.PersonRepository;
import com.ybq.sbexp.entiry.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTest2 {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void hello() {
        Person person = new Person();
        person.setAge(1);
        person.setName("ybq");
        personRepository.save(person);
        System.out.println("id: " + person.getId());

        List<Person> all = personRepository.findAll();
        System.out.println(all.size());
    }
}