package com.example.police_learning.service;


import com.example.police_learning.dao.UserRepository;
import com.example.police_learning.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = true)
    private UserRepository userRepository;

    @Override
    public User checkUser(String account, String password) {
        User user = userRepository.findByAccountAndPassword(account,password);
        return user;
    }
}
