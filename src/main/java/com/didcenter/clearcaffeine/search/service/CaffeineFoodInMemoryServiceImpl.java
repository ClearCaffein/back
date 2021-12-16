package com.didcenter.clearcaffeine.search.service;


import com.didcenter.clearcaffeine.search.service.VO.CaffeineFood;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CaffeineFoodInMemoryServiceImpl implements CaffeineFoodService {
    //todo make test for CaffeineFood
    @Override
    public boolean insertCaffeineFood(List<CaffeineFood> caffeineFoods) {
        return false;
    }

    @Override
    public CaffeineFood getCaffeineFood(String name) {
        return null;
    }

    @Override
    public List<CaffeineFood> getCaffeineHistory(String uid) {
        return null;
    }

    @Override
    public List<CaffeineFood> getCaffeineHistory(String uid, Date date) {
        return null;
    }
}
