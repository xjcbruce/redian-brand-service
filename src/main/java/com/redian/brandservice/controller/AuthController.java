package com.redian.brandservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "auth")
public class AuthController {

    @GetMapping(value = "/hello")
    public String hello() {
        log.info("访问 /auth/hello");
        return "hello! auth of redian brand";
    }

}
