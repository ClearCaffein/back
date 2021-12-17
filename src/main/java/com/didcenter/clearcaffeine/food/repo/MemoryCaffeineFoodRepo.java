package com.didcenter.clearcaffeine.food.repo;

import com.didcenter.clearcaffeine.food.CaffeineFood;

import java.util.List;

public class MemoryCaffeineFoodRepo implements CaffeineFoodRepository {
    @Override
    public List<CaffeineFood> search(String foodName) {
        return null;
    }

    @Override
    public Integer insertManyCaffeineFoods(List<CaffeineFood> caffeineFoods) {
        return null;
    }

    @Override
    public Integer insertCaffeineFood(CaffeineFood caffeineFood) {
        return null;
    }
}
