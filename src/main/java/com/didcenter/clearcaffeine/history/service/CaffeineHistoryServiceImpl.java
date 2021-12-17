package com.didcenter.clearcaffeine.history.service;

import com.didcenter.clearcaffeine.user.User;
import com.didcenter.clearcaffeine.history.CaffeineHistory;

import java.util.Date;
import java.util.List;

public class CaffeineHistoryServiceImpl implements CaffeineHistoryService {


    @Override
    public List<CaffeineHistory> searchHistory(User user) {
        return null;
    }

    @Override
    public List<CaffeineHistory> searchHistory(User user, Date date) {
        return null;
    }

    @Override
    public CaffeineHistory searchToday(User user) {
        return null;
    }

    @Override
    public Boolean insertTodayHistory(CaffeineHistory todayHistory) {
        return null;
    }
}
