package com.zhangyi.hrms.web.action;


import com.zhangyi.hrms.domain.ViewPersonList;
import com.zhangyi.hrms.service.IPersonListService;
import com.zhangyi.hrms.util.DateJsonValueProcessor;
import com.zhangyi.hrms.util.HRMSUtils;
import com.zhangyi.hrms.util.PageBean;
import com.zhangyi.hrms.web.action.base.BaseAction;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
@Scope("prototype")
public class PersonListAction extends BaseAction<ViewPersonList>{
    @Autowired
    private IPersonListService personListService;

    private String type;
    private String id;

    public void setType(String type) {
        this.type = (String) HRMSUtils.getSession().getAttribute("type");

    }

    public void setId(String id) {
        this.id = (String) HRMSUtils.getSession().getAttribute("id");

    }

    public String pageQuery() throws IOException {
        if(type!=null){
            detachedCriteria.add(Restrictions.eq(type,id));
        }
        personListService.pageQuery(pageBean);
        this.java2Json(pageBean);
        return NONE;
    }
}
