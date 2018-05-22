package com.zhangyi.hrms.service;

import com.zhangyi.hrms.domain.ViewMainTree;

import java.util.List;

public interface IMainTreeService {

    List initTree();

    List listOrg();

    List<ViewMainTree> listDept(String orgId);

    List<ViewMainTree> initOrgTree();
}
