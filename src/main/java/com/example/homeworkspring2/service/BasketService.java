package com.example.homeworkspring2.service;

import java.util.List;

public interface BasketService {
    void addProductId(List<Integer> id);

    List<Integer> getProductId();
}
