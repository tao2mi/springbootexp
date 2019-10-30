package com.ybq.sbexp.controller;

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
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CacheControllerTest {

    @Autowired
    private CacheController controller;
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserService userService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void hello() {
        when(userService.say("nihao")).thenReturn("good");
        Assert.assertEquals("goods", userService.say("nihao"));
    }
}