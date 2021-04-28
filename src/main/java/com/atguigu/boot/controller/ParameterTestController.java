package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Ceaate by 76819 on 2021/4/21
 */
@RestController
public class ParameterTestController {
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String username,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent")String useragent,
                                     @RequestHeader Map<String,String> allheader,
                                     @RequestParam("age") Integer age,
                                     @RequestParam Map<String,String> allparas){
        Map<String,Object> map = new HashMap<>();
//        map.put("id",id);
//        map.put("username",username);
//        map.put("pv",pv);
//        map.put("useragent",useragent);
//        map.put("allheader",allheader);
//        map.put("age",age);
//        map.put("allparas",allparas);
        return map;


    }

    @PostMapping("/saveuser")
    public Person saveuser(Person person){
        return person;

    }
}
