package com.zhangyi.hrms.dao.base;

import com.zhangyi.hrms.util.PageBean;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T> {
    public void save(T entity);
    public void delete(T entity);
    public void update(T entity);
    public T findById(Serializable id);
    public List<T> findAll();
    public void executeUpdate(String queryName,Object... objects);
    public void pageQuery(PageBean pageBean);
}
