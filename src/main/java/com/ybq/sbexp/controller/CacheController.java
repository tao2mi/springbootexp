package com.ybq.sbexp.controller;

import com.ybq.sbexp.dao.PersonRepository;
import com.ybq.sbexp.entiry.Person;
import com.ybq.sbexp.properties.MyProperty;
import com.ybq.sbexp.properties.MyProperty2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CacheController {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private MyProperty myProperty;
    @Autowired
    private MyProperty2 myProperty2;

    @RequestMapping("hello")
    @Cacheable(value="users", key="'mykey1_'+#param")
    public String hello(String param) {
        return "aaa";
    }

    @RequestMapping("person")
    public String hello() {

        return myProperty.getName();
        //return "b";
    }

    @RequestMapping("person2")
    public String hello2() {

        return myProperty2.getName();
        //return "b";
    }

    @RequestMapping("person3")
    public String hello3(HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        //request.getSession().setAttribute("name", "yangbaoqing");
        return sessionId;
    }


    @PostMapping("test")
    public Person test(Person person) {
        //person.setName("重");
        return person;
    }
}
