package com.ybq.sbexp.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestTemplateTest {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ApplicationContext ctx;

    @Test
    public void test1() {
        System.out.println(restTemplate);
        System.out.println(ctx.getBeanNamesForType(RestTemplate.class)[0]);
        String result = restTemplate.getForObject("https://www.baidu.com/", String.class);
        System.out.println(result);
    }
}
