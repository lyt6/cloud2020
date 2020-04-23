package com.helloworld.springcloud.payment.mapper;

import com.helloworld.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    Payment getById(Integer id);
}
