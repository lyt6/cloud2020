package com.hello.jsp.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class TestPersonConfig {
    private String name;
    private Integer age;
    private boolean man;
    private Map<String, Object> map;
    private List<Integer> list;
    private Son son;
}
