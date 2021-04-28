package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * Ceaate by 76819 on 2021/4/20
 */
@RestController
public class FormController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String handleGet(){
        return "Get User!!";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String handlePost(){
        return "Post User!!";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String handleDelete(){
        return "Delete User!!";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String handlePut(){
        return "Put User!!";
    }
}
