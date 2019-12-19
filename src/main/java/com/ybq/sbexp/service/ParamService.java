package com.ybq.sbexp.service;

import com.ybq.sbexp.annotation.ParamAnnotation;
import com.ybq.sbexp.controller.BizRequest;
import org.springframework.stereotype.Service;

@Service
public class ParamService {

    @ParamAnnotation({"name", "age", "time"})
    public String hello(BizRequest request) {

       return "person";
    }
}
