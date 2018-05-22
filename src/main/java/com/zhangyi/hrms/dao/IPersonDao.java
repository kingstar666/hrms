package com.zhangyi.hrms.dao;

import com.zhangyi.hrms.dao.base.IBaseDao;
import com.zhangyi.hrms.domain.PersonInfo;

import java.util.Date;

public interface IPersonDao extends IBaseDao<PersonInfo> {
    void updatePhoto(String personId);
}
