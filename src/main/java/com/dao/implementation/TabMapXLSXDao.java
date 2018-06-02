package com.dao.implementation;


import com.dao.intefaces.TabMapXLSXInterfaceDao;
import com.entity.TabMapXLSX;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("TabMapXLSXInterfaceDao")
public class TabMapXLSXDao extends AbstractDao implements TabMapXLSXInterfaceDao {

    public void save(TabMapXLSX object) {
        persist(object);
    }

    public List<TabMapXLSX> findAll() {
        Criteria criteria = getSession().createCriteria(TabMapXLSX.class);
        return (List<TabMapXLSX>) criteria.list();
    }

    public TabMapXLSX findById(int id) {
        Criteria criteria = getSession().createCriteria(TabMapXLSX.class);
        criteria.add(Restrictions.eq("id", id));
        return (TabMapXLSX) criteria.uniqueResult();
    }

    public void deleteById(int id) {
        Query query = getSession().createQuery("delete from  TabMapXLSX   where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();

    }

    public TabMapXLSX findByField(String field, String value) {
        Criteria criteria = getSession().createCriteria(TabMapXLSX.class);
        criteria.add(Restrictions.eq("name", value));
        return (TabMapXLSX) criteria.uniqueResult();
    }
}
