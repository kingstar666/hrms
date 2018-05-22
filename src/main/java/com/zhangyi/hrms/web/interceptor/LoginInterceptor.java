package com.zhangyi.hrms.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.zhangyi.hrms.domain.User;
import com.zhangyi.hrms.util.HRMSUtils;
import org.apache.struts2.ServletActionContext;

public class LoginInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        ActionProxy proxy = invocation.getProxy();
        String actionName = proxy.getActionName();
        String namespace = proxy.getNamespace();
        String url = namespace + actionName;
        User user = HRMSUtils.getLoginUser();
        if (user == null) {
            return "login";
        }
        return invocation.invoke();
    }
}
