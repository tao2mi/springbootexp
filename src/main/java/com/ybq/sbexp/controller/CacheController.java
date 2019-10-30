package com.ybq.sbexp.controller;

import com.ybq.sbexp.dao.PersonRepository;
import com.ybq.sbexp.entiry.Person;
import com.ybq.sbexp.properties.MyProperty;
import com.ybq.sbexp.properties.MyProperty2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
