package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class IndexController {

    private final static Logger log = LoggerFactory.getLogger(IndexController.class);

    @ResponseBody
    @RequestMapping("/hi")
    public String hi(){
        log.info("hi,my friend");
        return "hello, my friend";
    }
}
