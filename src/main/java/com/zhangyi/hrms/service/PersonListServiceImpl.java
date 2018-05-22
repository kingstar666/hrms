package com.zhangyi.hrms.service;

import com.zhangyi.hrms.dao.IPersonListDao;
import com.zhangyi.hrms.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonListServiceImpl implements IPersonListService {
    @Autowired
    private IPersonListDao personListDao;
    @Override
    public void pageQuery(PageBean pageBean) {
        personListDao.pageQuery(pageBean);
    }
}
