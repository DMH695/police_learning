package com.example.police_learning.service;

import com.example.police_learning.dao.InformationRepository;
import com.example.police_learning.po.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class InformationServiceImpl implements InformationService{
    @Autowired
    InformationRepository informationRepository;

    @Override
    public Page<Information> getPage(Integer pageNum, Integer pageLimit) {
        Pageable pageable = PageRequest.of(pageNum - 1,pageLimit);
        return informationRepository.findAll(pageable);
    }

    @Override
    public Page<Information> getPageSort(Integer pageNum, Integer pageLimit) {
        Sort sort = Sort.by(Sort.Order.desc("creatTime"));
        Pageable pageable =PageRequest.of(pageNum - 1,pageLimit);
        return informationRepository.findAll(pageable);
    }
    @Transactional
    @Override
    public Information saveInformation(Information information) {
        return informationRepository.save(information);
    }
}
