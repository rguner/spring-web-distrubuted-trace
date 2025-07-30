package com.example.springwebdistrubutedtrace.controller;

import com.example.springwebdistrubutedtrace.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    private final HelloService helloService;

    @GetMapping("/hello-world")
    public String hello() {
        logger.info("Hello");

        return helloService.sayHello();
    }
}
