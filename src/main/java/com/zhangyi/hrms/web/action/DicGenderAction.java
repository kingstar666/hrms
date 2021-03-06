package com.zhangyi.hrms.web.action;

import com.zhangyi.hrms.domain.DicGender;
import com.zhangyi.hrms.service.IDicGenderService;
import com.zhangyi.hrms.web.action.base.BaseAction;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Controller
@Scope("prototype")
public class DicGenderAction extends BaseAction<DicGender> {
    @Autowired
    private IDicGenderService dicGenderService;

    public String list() throws IOException {
        List<DicGender> list = new ArrayList<>();
        list = dicGenderService.findAll();
        String data = JSONArray.fromObject(list).toString();
        ServletActionContext.getResponse().setContentType("text/json;charset=utf-8");
        ServletActionContext.getResponse().getWriter().print(data);
        return NONE;
    }
}
