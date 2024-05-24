package com.larsen.chris.sandbox.gcp.helloapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloApiController {
    @GetMapping("/hello/{name}")
    public String getMethodName(@PathVariable String name) {
        return "Hello " + name;
    }
    
}
