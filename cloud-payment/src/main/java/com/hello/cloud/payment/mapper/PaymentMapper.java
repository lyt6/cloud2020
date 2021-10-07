package com.hello.cloud.payment.mapper;

import com.hello.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    Payment getById(Integer id);
}
