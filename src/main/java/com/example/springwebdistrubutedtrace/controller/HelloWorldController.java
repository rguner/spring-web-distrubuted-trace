package com.example.springwebdistrubutedtrace.controller;

import com.example.springwebdistrubutedtrace.service.HelloService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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

    @Resource
    private HttpSession httpSession;

    @Resource
    private HttpServletRequest httpServletRequest;

    @GetMapping("/hello-world")
    public String hello() {
        logger.info("Hello");
        httpServletRequest.getHeaderNames().asIterator().forEachRemaining(
            headerName -> {
                String headerValue = httpServletRequest.getHeader(headerName);
                logger.info("Header: {} = {}", headerName, headerValue);
            }
        );

        return helloService.sayHello();
    }
}
