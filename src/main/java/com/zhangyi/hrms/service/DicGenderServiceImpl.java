package com.zhangyi.hrms.service;

import com.zhangyi.hrms.dao.IDicGenderDao;
import com.zhangyi.hrms.domain.DicGender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DicGenderServiceImpl implements IDicGenderService {
    @Autowired
    private IDicGenderDao dicGenderDao;

    @Override
    public List<DicGender> findAll() {
        return dicGenderDao.findAll();
    }
}
