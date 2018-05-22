package com.zhangyi.hrms.web.action;

import com.zhangyi.hrms.domain.ViewMainTree;
import com.zhangyi.hrms.service.IMainTreeService;
import com.zhangyi.hrms.util.HRMSUtils;
import com.zhangyi.hrms.util.PageBean;
import com.zhangyi.hrms.web.action.base.BaseAction;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
public class MainTreeAction extends BaseAction<ViewMainTree> {
    @Autowired
    private IMainTreeService mainTreeService;
    private String orgId;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String initTree() throws IOException {

        List<ViewMainTree> list = new ArrayList<>();
        list = mainTreeService.initTree();
        String mainTree = JSONArray.fromObject(list).toString();
        ServletActionContext.getResponse().setContentType("text/json;charset=utf-8");
        ServletActionContext.getResponse().getWriter().print(mainTree);

        return NONE;
    }
    public String initOrgTree() throws IOException{
        List<ViewMainTree> list = new ArrayList<>();
        list = mainTreeService.initOrgTree();
        String mainTree = JSONArray.fromObject(list).toString();
        ServletActionContext.getResponse().setContentType("text/json;charset=utf-8");
        ServletActionContext.getResponse().getWriter().print(mainTree);

        return NONE;
    }
    public String listOrg() throws IOException {
        List<ViewMainTree> list = new ArrayList<>();
        list = mainTreeService.listOrg();
        String orgList = JSONArray.fromObject(list).toString();
        ServletActionContext.getResponse().setContentType("text/json;charset=utf-8");
        ServletActionContext.getResponse().getWriter().print(orgList);
        return NONE;
    }

    public String listDept() throws IOException {
        List<ViewMainTree> list = new ArrayList<>();
        list = mainTreeService.listDept(orgId);
        String orgList = JSONArray.fromObject(list).toString();
        ServletActionContext.getResponse().setContentType("text/json;charset=utf-8");
        ServletActionContext.getResponse().getWriter().print(orgList);
        return NONE;
    }
}
