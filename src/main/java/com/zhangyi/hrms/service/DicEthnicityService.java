package com.zhangyi.hrms.service;

import com.zhangyi.hrms.dao.IDicEthnicityDao;
import com.zhangyi.hrms.domain.DicEthnicity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DicEthnicityService implements IDicEthnicityService{
    @Autowired
    private IDicEthnicityDao dicEthnicityDao;


    @Override
    public List<DicEthnicity> findAll() {
        return dicEthnicityDao.findAll();
    }
}
