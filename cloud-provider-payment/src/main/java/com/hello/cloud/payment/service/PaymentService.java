package com.hello.cloud.payment.service;


import com.hello.cloud.entities.Payment;

public interface PaymentService {
    Payment getById(Integer id);
}
