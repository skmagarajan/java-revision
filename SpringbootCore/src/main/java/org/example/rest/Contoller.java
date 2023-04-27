package org.example.rest;

import org.springframework.web.bind.annotation.*;

@RestController
public class Contoller {

    @GetMapping("/healthcheck")
    public String healthcheck(){
        return "Hello Boss";
    }

    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x,@PathVariable int y){
        return Integer.toString(x+y);
    }
}
