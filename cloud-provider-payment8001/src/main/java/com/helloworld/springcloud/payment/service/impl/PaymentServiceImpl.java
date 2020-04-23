package com.helloworld.springcloud.payment.service.impl;

import com.helloworld.springcloud.entities.Payment;
import com.helloworld.springcloud.payment.mapper.PaymentMapper;
import com.helloworld.springcloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment getById(Integer id) {
        return paymentMapper.getById(id);
    }
}
