package com.didcenter.clearcaffeine.user.service;

import com.didcenter.clearcaffeine.user.User;

public interface UserService {
    Boolean join(User newUser);
    User find(Long uid);
    User find(String userName);
    Boolean delete(Long uid);
}
