package com.didcenter.clearcaffeine.user.repo;

import com.didcenter.clearcaffeine.user.User;

public interface UserRepository {
    Boolean join(User newUser);
    User find(Long uid);
    User find(String userName);
    Boolean delete(Long uid);
}
