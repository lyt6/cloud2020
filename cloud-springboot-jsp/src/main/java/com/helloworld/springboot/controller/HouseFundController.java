package com.helloworld.springboot.controller;

import com.helloworld.springboot.model.HouseFund;
import com.helloworld.springboot.service.HouseFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseFundController {

    @Autowired
    private HouseFundService houseFundService;

    @RequestMapping("/houseFunds")
    @ResponseBody
    public List<HouseFund> getHouseFundList(){
        List<HouseFund> allHouseFundList = houseFundService.getAllHouseFundList();
        return allHouseFundList;
    }
}
