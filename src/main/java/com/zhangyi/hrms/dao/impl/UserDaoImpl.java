package com.zhangyi.hrms.dao.impl;

import com.zhangyi.hrms.dao.IUserDao;
import com.zhangyi.hrms.dao.base.impl.BaseDaoImpl;
import com.zhangyi.hrms.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {
    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        String hql = "FROM User u WHERE u.username=? and u.password=?";
        List<User> list = (List<User>) this.getHibernateTemplate().find(hql, username, password);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
