package com.example.police_learning.dao;

import com.example.police_learning.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,String>{
    User findByAccountAndPassword(String account, String password);
}
