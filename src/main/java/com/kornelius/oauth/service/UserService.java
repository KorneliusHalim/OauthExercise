package com.kornelius.oauth.service;

import com.kornelius.oauth.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
