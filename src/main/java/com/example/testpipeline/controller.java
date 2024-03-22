package com.example.testpipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("test2")
    public String test()
    {
        return "test secce";
    }
}
