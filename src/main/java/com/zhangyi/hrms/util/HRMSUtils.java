package com.zhangyi.hrms.util;

import com.zhangyi.hrms.domain.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.Servlet;
import javax.servlet.http.HttpSession;

public class HRMSUtils {
    public static HttpSession getSession() {
        return ServletActionContext.getRequest().getSession();
    }

    public static User getLoginUser(){
        return (User) getSession().getAttribute("loginUser");
    }
}
