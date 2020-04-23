package com.helloworld.springcloud.payment.service;


import com.helloworld.springcloud.entities.Payment;

public interface PaymentService {
    Payment getById(Integer id);
}
