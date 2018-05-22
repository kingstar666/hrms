package com.zhangyi.hrms.dao;

import com.zhangyi.hrms.dao.base.IBaseDao;
import com.zhangyi.hrms.domain.User;

public interface IUserDao extends IBaseDao<User> {

    User findUserByUsernameAndPassword(String username, String password);
}
