package com.example.helloworld.controller;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@RestController
public class HelloController {
    private Map<String, Object> result = new TreeMap<>();

    @RequestMapping("/hello")
    //@ResponseBody
    public Map<String, Object> hello() {

        result.put("city", "San Jose");
        result.put("name", "Stephen");
        result.put("age","20");
        result.put("country","India");
        result.put("b","101");
        System.out.println("response body printed");
        return result;
    }
}
