package com.example.homeworkspring2.controller;

import com.example.homeworkspring2.service.BasketServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.awt.*;
import java.util.List;


@RestController
@RequestMapping(path = "/order")//создается раздел order, а начальный раздел store создан в конфигурационном файле
//application.properties
public class controller {
    private BasketServiceImpl basketService;

    public controller(BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/greeting")// полный путь будет /store/order/greeting
    public String hello() {
        return "Добро пожаловать на наш сайт";
    }

    @GetMapping(path = {"/add"})
    public void add(@RequestParam List<Integer> id) {
        basketService.addProductId(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return basketService.getProductId();
    }
}




