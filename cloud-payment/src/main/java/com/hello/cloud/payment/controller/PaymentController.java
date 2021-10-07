package com.hello.cloud.payment.controller;

import com.hello.cloud.entities.CommonResult;
import com.hello.cloud.entities.Payment;
import com.hello.cloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{id}")
    public CommonResult getById(@PathVariable(value = "id") Integer id) {
        Payment payment = paymentService.getById(id);
        return new CommonResult(200, "ok", payment);
    }
}
