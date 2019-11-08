package com.ybq.sbexp.controller;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BizRequest {
    private int age;
    private String name;
    private LocalDateTime time;

}
