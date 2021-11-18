package com.example.police_learning.service;

import com.example.police_learning.po.Information;
import org.springframework.data.domain.Page;

public interface InformationService {
    //普通排序
    Page<Information> getPage(Integer pageNum,Integer pageLimit);
    //分页排序
    Page<Information> getPageSort(Integer pageNum, Integer pageLimit);
    //保存一个information对象
    Information saveInformation(Information information);
}
