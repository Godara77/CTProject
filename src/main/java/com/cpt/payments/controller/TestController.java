package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")

public class TestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }
    @GetMapping("addGet")
    public int addGet(@RequestParam(value = "num1") int val1,
                   @RequestParam(value = "num2") int val2){
        System.out.println("Calling addGet::al1:" + val1 + "|val2"+val2);
        int res = val1+val2;
        System.out.println("Add res:"+res);
        return res;
    }
    @PostMapping("addPost")
    public int addPost(@RequestParam(value = "num1") int val1,
                   @RequestParam(value = "num2") int val2){
        System.out.println(" Calling addPost::val1:" + val1 + "|val2"+val2);
        int res = val1+val2;
        System.out.println("Add res:"+res);
        return res;
    }
    public String initPayment(String paymentMethod, int amount, String curr){
        return "Payment Processed Successfully";
    }
}
