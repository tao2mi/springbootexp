package com.ybq.sbexp.controller;

import com.ybq.sbexp.service.ParamService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AnnotationTest {
    @Autowired
    ParamService service;

    @Test
    public void test() {
        BizRequest request = new BizRequest();
        //request.setName("ybq");
        //request.setAge(11);
        //request.setTime(LocalDateTime.now());
        String result = service.hello(request);
        System.out.println(result);
    }
}
