package com.example.police_learning.service;

import com.example.police_learning.po.User;

public interface UserService {
    User checkUser(String account, String password);
}
