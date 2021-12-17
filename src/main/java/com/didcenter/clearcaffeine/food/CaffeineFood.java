package com.didcenter.clearcaffeine.food;

import com.didcenter.clearcaffeine.user.User;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class CaffeineFood {
    private User user;
    private CaffeineFood caffeineFood;
    private Timestamp drinkTime;
}
