package com.zhangyi.hrms.service;

import com.zhangyi.hrms.domain.PersonInfo;

import java.text.ParseException;

public interface IPersonService {
    PersonInfo query(String personId);

    void updatePhoto(String personId);

    void addPersonInfo(PersonInfo model, String orgId, String deptId) throws ParseException;
}
