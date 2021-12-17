package com.didcenter.clearcaffeine.food.repo;

import com.didcenter.clearcaffeine.food.CaffeineFood;

import java.util.List;

public interface CaffeineFoodRepository {
    List<CaffeineFood> search(String foodName);
    Integer insertManyCaffeineFoods(List<CaffeineFood> caffeineFoods);
    Integer insertCaffeineFood(CaffeineFood caffeineFood);
}
