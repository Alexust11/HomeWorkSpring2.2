package com.example.homeworkspring2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService{
    private List<Integer> basket;

    public BasketServiceImpl(List<Integer> basket) {
        this.basket = basket;
    }

    @Override
    public void addProductId(List<Integer> id) {
        basket.addAll(id);
    }

    @Override
    public List<Integer> getProductId() {
        return basket;
    }


}
