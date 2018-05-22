package com.zhangyi.hrms.service;

import com.zhangyi.hrms.domain.DicGender;
import com.zhangyi.hrms.domain.DicNation;

import java.util.List;

public interface IDicNationService {
    List<DicNation> findAll();
}
