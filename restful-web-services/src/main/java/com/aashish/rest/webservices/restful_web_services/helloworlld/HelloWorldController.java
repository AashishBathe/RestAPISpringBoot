package com.aashish.rest.webservices.restful_web_services.helloworlld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello world!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello world!");
    }

    @GetMapping(path = "/hello-world/path-var/{name}")
    public HelloWorldBean helloWorldPathVar(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello world, %s!", name));
    }
}
