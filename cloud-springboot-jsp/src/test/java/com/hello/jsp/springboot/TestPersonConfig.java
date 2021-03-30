package com.hello.jsp.springboot;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JspApplication.class)
public class TestPersonConfig {

    @Autowired
    private TestPersonConfig personConfig;

    @Test
    public void testPerson(){
      log.info("personConfig:{}", JSONObject.toJSONString(personConfig));
    }

}
