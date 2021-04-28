package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Ceaate by 76819 on 2021/4/23
 */
@Controller
public class AttributeController {
    @GetMapping("/save")
    public String save(HttpServletRequest Request){
        Request.setAttribute("code",20);
        return "forward:/success";

    }



    @GetMapping("/params")
    public String params(Map<String,Object> map,
                         Model model,
                         HttpServletRequest request,
                         HttpServletResponse response){
        map.put("map","hellomap");
        model.addAttribute("model","hellomodel");
        request.setAttribute("request","hellorequest");
        Cookie cookie = new Cookie("c1","v1");
        cookie.setMaxAge(12);
        response.addCookie(cookie);
        return "forward:/success";
    }


    @ResponseBody
    @GetMapping("/success")
    public Map<String,Object> show(HttpServletRequest request,
                                   @RequestAttribute(value = "code",required = false) String code){
        Object code1 =  request.getAttribute("code");
        Map<String,Object> map = new HashMap<>();
        map.put("code1",code1);
//        map.put("注解",code);

        map.put("map",request.getAttribute("map"));
        map.put("model",request.getAttribute("model"));
        map.put("request",request.getAttribute("request"));
        return map;
    }
}
