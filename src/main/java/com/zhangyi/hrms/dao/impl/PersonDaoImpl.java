package com.zhangyi.hrms.dao.impl;

import com.zhangyi.hrms.dao.IPersonDao;
import com.zhangyi.hrms.dao.base.impl.BaseDaoImpl;
import com.zhangyi.hrms.domain.PersonInfo;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl extends BaseDaoImpl<PersonInfo> implements IPersonDao {
    @Override
    public void updatePhoto(String personId) {
        PersonInfo personInfo = getHibernateTemplate().get(PersonInfo.class,personId);
        personInfo.setPhoto(personId);
        getHibernateTemplate().update(personInfo);
    }
}
