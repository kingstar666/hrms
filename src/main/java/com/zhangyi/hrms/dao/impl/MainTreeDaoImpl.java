package com.zhangyi.hrms.dao.impl;

import com.zhangyi.hrms.dao.IMainTreeDao;
import com.zhangyi.hrms.dao.base.impl.BaseDaoImpl;
import com.zhangyi.hrms.domain.ViewMainTree;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MainTreeDaoImpl extends BaseDaoImpl<ViewMainTree> implements IMainTreeDao {
    @Override
    public List initTree() {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ViewMainTree.class);
        detachedCriteria.addOrder(Order.asc("sequence"));
        return this.getHibernateTemplate().findByCriteria(detachedCriteria);
    }

    @Override
    public List listOrg() {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ViewMainTree.class);
        detachedCriteria.add((Restrictions.eq("type","orgId")));
        detachedCriteria.addOrder(Order.asc("sequence"));
        return this.getHibernateTemplate().findByCriteria(detachedCriteria);
    }

    @Override
    public List listDept(String orgId) {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ViewMainTree.class);
        detachedCriteria.add((Restrictions.eq("type","deptId")));
        detachedCriteria.add((Restrictions.eq("pId",orgId)));
        detachedCriteria.addOrder(Order.asc("sequence"));
        return this.getHibernateTemplate().findByCriteria(detachedCriteria);
    }

    @Override
    public List initOrgTree() {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ViewMainTree.class);
        detachedCriteria.addOrder(Order.asc("sequence"));
        detachedCriteria.add(Restrictions.or(Restrictions.eq("type","orgId"),Restrictions.eq("type","deptId")));
        return this.getHibernateTemplate().findByCriteria(detachedCriteria);
    }
}
