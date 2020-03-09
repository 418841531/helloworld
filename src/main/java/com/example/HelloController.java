package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world
 *
 * @author JJ
 * @create_time 2020-03-09
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String hello() {

        return "hello world 3";
    }
}
