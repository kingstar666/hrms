package com.zhangyi.hrms.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.zhangyi.hrms.domain.PersonInfo;
import com.zhangyi.hrms.service.IPersonService;
import com.zhangyi.hrms.util.HRMSUtils;
import com.zhangyi.hrms.web.action.base.BaseAction;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.util.Enumeration;

@Controller
@Scope("prototype")
public class PersonAction extends BaseAction<PersonInfo> {
    @Autowired
    private IPersonService personService;

    private String orgId;
    private String deptId;

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String query() {

        String personId = model.getPersonId();
        model = personService.query(personId);
        ActionContext.getContext().getValueStack().push(model);
        return "detail";
    }

    public String add() throws ParseException {
        personService.addPersonInfo(model,orgId,deptId);
        return NONE;
    }
}
