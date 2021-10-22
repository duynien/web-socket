package com.tupinamba.springbootwebsocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
    @RequestMapping("/")
    public String chat(){
        return "main";
    }
    @RequestMapping("/admin")
    public String chatA(){
        return "admin";
    }
}
