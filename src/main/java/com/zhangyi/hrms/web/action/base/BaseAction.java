package com.zhangyi.hrms.web.action.base;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhangyi.hrms.util.DateJsonValueProcessor;
import com.zhangyi.hrms.util.PageBean;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
    protected T model;

    public static final String HOME = "home";


    public void setPage(int page) {
        pageBean.setCurrentPage(page);
    }

    public void setRows(int rows) {
        pageBean.setPageSize(rows);
    }

    protected PageBean pageBean = new PageBean();

    protected DetachedCriteria detachedCriteria = null;

    public BaseAction() {
        ParameterizedType superClass = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = superClass.getActualTypeArguments();
        Class<T> entityClass = (Class<T>) actualTypeArguments[0];
        detachedCriteria = DetachedCriteria.forClass(entityClass);
        pageBean.setDetachedCriteria(detachedCriteria);
        try {
            model = entityClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public void java2Json(Object o,String[] excludes) {
        String dateformat = "yyyy-MM-dd";
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(java.util.Date.class,new DateJsonValueProcessor(dateformat));
        jsonConfig.registerJsonValueProcessor(java.sql.Date.class,new DateJsonValueProcessor(dateformat));
        jsonConfig.setExcludes(excludes);
        String json = JSONObject.fromObject(pageBean,jsonConfig).toString();
        ServletActionContext.getResponse().setContentType("text/json;charset=utf-8");
        try {
            ServletActionContext.getResponse().getWriter().print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void java2Json(Object o) {
        String dateformat = "yyyy-MM-dd";
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(java.util.Date.class,new DateJsonValueProcessor(dateformat));
        jsonConfig.registerJsonValueProcessor(java.sql.Date.class,new DateJsonValueProcessor(dateformat));
        String json = JSONObject.fromObject(pageBean,jsonConfig).toString();
        ServletActionContext.getResponse().setContentType("text/json;charset=utf-8");
        try {
            ServletActionContext.getResponse().getWriter().print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T getModel() {
        return model;
    }
}
