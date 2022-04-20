package com.example.hellodocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chencheng
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/")
    public String index() {
        return "hello docker!";
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test hello docker!";
    }
}


