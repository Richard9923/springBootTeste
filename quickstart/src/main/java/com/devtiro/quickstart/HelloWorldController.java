package com.devtiro.quickstart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWorldController {
    
    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Helloo World";
    }
}
