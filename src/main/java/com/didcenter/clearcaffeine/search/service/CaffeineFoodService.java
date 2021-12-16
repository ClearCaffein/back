package com.didcenter.clearcaffeine.search.service;

import com.didcenter.clearcaffeine.search.service.VO.CaffeineFood;

import java.util.Date;
import java.util.List;


public interface CaffeineFoodService {
    boolean insertCaffeineFood(List<CaffeineFood> caffeineFoods);
    CaffeineFood getCaffeineFood(String name);
    List<CaffeineFood> getCaffeineHistory(String uid);
    List<CaffeineFood> getCaffeineHistory(String uid, Date date);
}
