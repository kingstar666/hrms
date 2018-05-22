package com.zhangyi.hrms.service;

import com.zhangyi.hrms.dao.IUserDao;
import com.zhangyi.hrms.domain.User;
import com.zhangyi.hrms.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public User login(User user) {
        String password = MD5Utils.md5(user.getPassword());
        return userDao.findUserByUsernameAndPassword(user.getUsername(),password);
    }
}
