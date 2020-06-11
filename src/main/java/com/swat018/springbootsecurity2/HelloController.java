package com.swat018.springbootsecurity2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello";
    }

    @GetMapping("/my")
    public String my() {
        return "my";
    }
}
