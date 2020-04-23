package com.helloworld.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;

    @Value("${person.addr}")
    private String addr;

    @Value("${sitetArray}")
    private String[] sitetArray;

    @RequestMapping("/")
    public String toIndex(Model model){
        model.addAttribute("name", "hello world !"+" name="+name+" age="+String.valueOf(age)+ " addr="+addr);
        System.out.println(JSONObject.toJSONString(sitetArray));
        return "index";
    }
}
