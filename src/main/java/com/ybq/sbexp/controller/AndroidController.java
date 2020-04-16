package com.ybq.sbexp.controller;

import com.google.common.collect.Maps;
import com.ybq.sbexp.dao.PersonRepository;
import com.ybq.sbexp.entiry.Person;
import com.ybq.sbexp.properties.MyProperty;
import com.ybq.sbexp.properties.MyProperty2;
import com.ybq.sbexp.util.Imagebase64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("android")
public class AndroidController {


    @RequestMapping("test1")
    public Object test1(String image) {
        Map<String, Object> m = Maps.newConcurrentMap();
//        m.put("email", email);
//        m.put("name", name);
        m.put("image", image);

        Imagebase64.base64StringToImage(image);
        return m;
    }

    @RequestMapping("test")
    public String test() {

        return "test";

    }


}
