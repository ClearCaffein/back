package com.didcenter.clearcaffeine.food.service;

import com.didcenter.clearcaffeine.food.CaffeineFood;

import java.util.List;


public interface CaffeineFoodService {


    List<CaffeineFood> search(String foodName);
}
