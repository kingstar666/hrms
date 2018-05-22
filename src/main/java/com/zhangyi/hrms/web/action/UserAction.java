package com.zhangyi.hrms.web.action;

import com.zhangyi.hrms.domain.User;
import com.zhangyi.hrms.service.IUserService;
import com.zhangyi.hrms.web.action.base.BaseAction;
import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Locale;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User> {
    private String checkcode;

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    @Autowired
    private IUserService userService;

    public String login() {
        String validatecode = (String) ServletActionContext.getRequest().getSession().getAttribute("key");
        if (StringUtils.isNotBlank(checkcode) && checkcode.equals(validatecode)) {
            User user =userService.login(model);
            if(user!=null){
                ServletActionContext.getRequest().getSession().setAttribute("loginUser",user);
                return HOME;
            }else{
                this.addActionError("输入的用户名或密码错误");
                return LOGIN;
            }
        } else {
            this.addActionError("输入的验证码错误");
            return LOGIN;
        }

    }

    public String logout(){
        ServletActionContext.getRequest().getSession().invalidate();
        return LOGIN;
    }
}
