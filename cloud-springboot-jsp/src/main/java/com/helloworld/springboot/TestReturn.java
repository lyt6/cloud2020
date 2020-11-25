package com.helloworld.springboot;

import com.helloworld.springboot.model.User;
import org.modelmapper.ModelMapper;

public class TestReturn {
    public static void main(String[] args) {

        //modelMapper
        ModelMapper modelMapper = new ModelMapper();

        User user = new User(12,"zhangsan");
        User modelMapperUser = modelMapper.map(user, User.class);

        System.out.println(user == modelMapperUser);
        System.out.println(modelMapperUser.toString());

        System.out.println("---------------------------");
        modelMapperUser.setAge(18);
        System.out.println(user.toString());
        System.out.println(modelMapperUser.toString());

    }
}
