package com.example.police_learning.dao;

import com.example.police_learning.po.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information,Long> {

}
