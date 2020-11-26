package com.helloworld.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class PersonConfig {
    private String name;
    private Integer age;
    private boolean man;
    private Map<String,Object> map;
    private List<Integer> list;
    private Son son;
}
