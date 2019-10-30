package com.ybq.sbexp.controller;

import com.ybq.sbexp.Application;
import com.ybq.sbexp.dao.PersonRepository;
import com.ybq.sbexp.entiry.Person;
import com.ybq.sbexp.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonRepositoryTest {

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