package com.didcenter.clearcaffeine.user.repo;

import com.didcenter.clearcaffeine.user.User;

import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepo implements UserRepository{

    private final Map<Long, User> storage = new HashMap();

    @Override
    public User join(User newUser) {
        if(storage.containsValue(newUser)){
            return null;
        }else {
            storage.put(newUser.getUid(), newUser);
            return newUser;
        }
    }

    @Override
    public User find(Long uid) {
        return storage.get(uid);
    }

    @Override
    public User find(String userName) {
        for (Long id : storage.keySet()) {
            if(storage.get(id).getName().equals(userName)){
                return storage.get(id);
            }
        }
        return null;
    }

    @Override
    public Boolean delete(Long uid) {
        return storage.remove(uid) != null;
    }
}
