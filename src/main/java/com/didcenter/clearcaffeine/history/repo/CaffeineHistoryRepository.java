package com.didcenter.clearcaffeine.history.repo;


import com.didcenter.clearcaffeine.history.CaffeineHistory;

import java.util.Date;
import java.util.List;

public interface CaffeineHistoryRepository {
    List<CaffeineHistory> searchHistory(Long uid);
    List<CaffeineHistory> searchHistory(Long uid, Date date);
    CaffeineHistory searchToday(Long uid);
    Boolean insert(CaffeineHistory caffeineHistory);
}
