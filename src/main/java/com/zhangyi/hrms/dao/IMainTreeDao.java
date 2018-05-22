package com.zhangyi.hrms.dao;

import com.zhangyi.hrms.dao.base.IBaseDao;
import com.zhangyi.hrms.domain.ViewMainTree;

import java.util.List;

public interface IMainTreeDao extends IBaseDao<ViewMainTree> {

    List initTree();

    List listOrg();

    List  listDept(String orgId);

    List<ViewMainTree> initOrgTree();
}
