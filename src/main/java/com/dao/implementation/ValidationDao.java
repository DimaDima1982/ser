package com.dao.implementation;


import com.dao.intefaces.ValidationInterfaceDao;
import com.entity.Validation;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ValidationInterfaceDao")
public class ValidationDao extends AbstractDao implements ValidationInterfaceDao {

    public void save(Validation object) {
        persist(object);
    }

    public List<Validation> findAll() {
        Criteria criteria = getSession().createCriteria(Validation.class);
        return (List<Validation>) criteria.list();
    }

    public Validation findById(int id) {
        Criteria criteria = getSession().createCriteria(Validation.class);
        criteria.add(Restrictions.eq("id", id));
        return (Validation) criteria.uniqueResult();
    }

    public void deleteById(int id) {
        Query query = getSession().createQuery("delete from  Validation   where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();

    }

    public Validation findByField(String field, String value) {
        Criteria criteria = getSession().createCriteria(Validation.class);
        criteria.add(Restrictions.eq("name", value));
        return (Validation) criteria.uniqueResult();
    }
}
