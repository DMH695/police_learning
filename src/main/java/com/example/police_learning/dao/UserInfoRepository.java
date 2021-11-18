package com.example.police_learning.dao;

import com.example.police_learning.po.UserInfo;
import com.example.police_learning.po.UserKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, UserKey> {

}
