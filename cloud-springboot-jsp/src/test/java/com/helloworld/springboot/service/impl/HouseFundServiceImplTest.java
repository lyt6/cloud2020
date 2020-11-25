package com.helloworld.springboot.service.impl;

import com.helloworld.springboot.SpringbootJspApplication;
import com.helloworld.springboot.helper.BeanHelper;
import com.helloworld.springboot.model.HouseFund;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJspApplication.class)
public class HouseFundServiceImplTest {

    @Test
    public void testBean(){

        // default singleton
        HouseFund bean1 = (HouseFund) BeanHelper.getBean(HouseFund.class);
        bean1.setId(123456L);
        System.out.println(bean1.toString());
        HouseFund bean2 = (HouseFund) BeanHelper.getBean(HouseFund.class);
        System.out.println(bean2.toString());

        //


    }

}