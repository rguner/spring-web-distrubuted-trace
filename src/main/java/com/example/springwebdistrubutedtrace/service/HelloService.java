package com.example.springwebdistrubutedtrace.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloService {

    public String sayHello() {
        log.info("Hello from HelloService!");
        return "Hello, World!";
    }
}
