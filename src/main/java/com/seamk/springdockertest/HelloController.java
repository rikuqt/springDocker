package com.seamk.springdockertest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller handling basic greeting endpoints.
 */
@Controller
public final class HelloController {

    /**
     * Returns a default greeting message.
     *
     * @return "Hello, World!" string.
     */
    @GetMapping("/")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    /**
     * Returns a general greeting message.
     *
     * @return "Hello, Someone!" string.
     */
    @GetMapping("/hello")
    @ResponseBody
    public String sayHelloToSomeone() {
        return "Hello, Someone!";
    }
}
