package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sjp on 2017/4/25.
 */
@RestController
public class HelloController {
    protected static Logger logger= LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String helloworld(){
        logger.debug("访问hello");
        return "Hello world!";
    }

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        logger.debug("访问helloName,Name={}",name);
        return "Hello "+name;
    }
}
