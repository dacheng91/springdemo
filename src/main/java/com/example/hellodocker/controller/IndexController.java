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

    @RequestMapping(value = "/course/query/list/aaa")
    public String course() {
        return "course query list!";
    }

    @RequestMapping(value = "/book/query/list/aaa")
    public String book() {
        return "book query list!";
    }

    @RequestMapping(value = "/product/query/list/aaa")
    public String product() {
        return "product query list!";
    }

    @RequestMapping(value = "/user/query/list/aaa")
    public String user() {
        return "user query list!";
    }
}


