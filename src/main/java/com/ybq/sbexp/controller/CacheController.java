package com.ybq.sbexp.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @RequestMapping
    @Cacheable(value="users", key="'mykey1_'+#param")
    public String hello(String param) {
        return "aaa";
    }
}
