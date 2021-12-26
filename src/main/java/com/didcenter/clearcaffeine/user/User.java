package com.didcenter.clearcaffeine.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;


@Getter
@Setter
@ToString
public class User {

    public User(Long uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    private Long uid;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uid.equals(user.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}
