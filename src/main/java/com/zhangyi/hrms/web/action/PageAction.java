package com.zhangyi.hrms.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhangyi.hrms.util.HRMSUtils;

public class PageAction extends ActionSupport {
    private String type;
    private String id;

    public void setType(String type) {
        this.type = type;
        HRMSUtils.getSession().setAttribute("type", type);
    }

    public void setId(String id) {
        this.id = id;
        HRMSUtils.getSession().setAttribute("id", id);
    }
}
