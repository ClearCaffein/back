package com.didcenter.clearcaffeine.history.repo;

import com.didcenter.clearcaffeine.history.CaffeineHistory;

import java.util.Date;
import java.util.List;

public class MemoryCaffeineHistoryRepo implements CaffeineHistoryRepository {
    @Override
    public List<CaffeineHistory> searchHistory(Long uid) {
        return null;
    }

    @Override
    public List<CaffeineHistory> searchHistory(Long uid, Date date) {
        return null;
    }

    @Override
    public CaffeineHistory searchToday(Long uid) {
        return null;
    }

    @Override
    public Boolean insert(CaffeineHistory caffeineHistory) {
        return null;
    }
}
