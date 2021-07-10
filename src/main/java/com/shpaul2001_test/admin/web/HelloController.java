package com.shpaul2001_test.admin.web;
import org.springframework.web.bind.annotation.*;
@RestController//


public class HelloController {
    @GetMapping("/hello") //
    public String hello(){
        return "hello";
    }
}
