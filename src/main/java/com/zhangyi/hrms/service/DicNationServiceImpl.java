package com.zhangyi.hrms.service;

import com.zhangyi.hrms.dao.IDicNationDao;
import com.zhangyi.hrms.domain.DicGender;
import com.zhangyi.hrms.domain.DicNation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DicNationServiceImpl implements IDicNationService {
    @Autowired
    private IDicNationDao dicNationDao;
    @Override
    public List<DicNation> findAll() {
        return dicNationDao.findAll();
    }
}
