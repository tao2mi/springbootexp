package com.ybq.sbexp.controller;

import com.ybq.sbexp.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(CacheController.class)
@AutoConfigureMockMvc
public class CacheControllerTest2 {

    @Autowired
    private MockMvc mockMvc;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void hello() throws Exception {
        String result = mockMvc.perform(get("/person2")).andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }
}