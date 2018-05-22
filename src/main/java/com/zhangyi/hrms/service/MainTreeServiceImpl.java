package com.zhangyi.hrms.service;

import com.zhangyi.hrms.dao.IMainTreeDao;
import com.zhangyi.hrms.domain.ViewMainTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MainTreeServiceImpl implements IMainTreeService {
    @Autowired
    private IMainTreeDao mainTreeDao;
    @Override
    public List initTree() {
        return  mainTreeDao.initTree();
    }

    @Override
    public List listOrg() {
        return mainTreeDao.listOrg();
    }

    @Override
    public List<ViewMainTree> listDept(String orgId) {
        return mainTreeDao.listDept(orgId);
    }

    @Override
    public List<ViewMainTree> initOrgTree() {
        return mainTreeDao.initOrgTree();
    }
}
