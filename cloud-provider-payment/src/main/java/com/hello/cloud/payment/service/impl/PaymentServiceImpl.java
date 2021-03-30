package com.hello.cloud.payment.service.impl;

import com.hello.cloud.entities.Payment;
import com.hello.cloud.payment.service.PaymentService;
import com.hello.cloud.payment.mapper.PaymentMapper;
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
