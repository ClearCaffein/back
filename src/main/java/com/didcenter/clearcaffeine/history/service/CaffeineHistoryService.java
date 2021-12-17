package com.didcenter.clearcaffeine.history.service;

import com.didcenter.clearcaffeine.user.User;
import com.didcenter.clearcaffeine.history.CaffeineHistory;

import java.util.Date;
import java.util.List;

public interface CaffeineHistoryService {
    List<CaffeineHistory> searchHistory(User user);
    List<CaffeineHistory> searchHistory(User user, Date date);
    CaffeineHistory searchToday(User user);
    Boolean insertTodayHistory(CaffeineHistory todayHistory);
}
