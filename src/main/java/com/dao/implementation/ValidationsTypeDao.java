package com.dao.implementation;

import com.dao.intefaces.ValidationsTypeInterfaceDao;
import com.entity.ValidationsType;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ValidationsTypeInterfaceDao")
public class ValidationsTypeDao extends AbstractDao implements ValidationsTypeInterfaceDao {
    public void save(ValidationsType object) {
        persist(object);
    }

    public List<ValidationsType> findAll() {
        Criteria criteria = getSession().createCriteria(ValidationsType.class);
        return (List<ValidationsType>) criteria.list();
    }

    public ValidationsType findById(int id) {
        Criteria criteria = getSession().createCriteria(ValidationsType.class);
        criteria.add(Restrictions.eq("id", id));
        return (ValidationsType) criteria.uniqueResult();
    }

    public void deleteById(int id) {
        Query query = getSession().createQuery("delete from  ValidationsType   where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();

    }

    public ValidationsType findByField(String field, String value) {
        Criteria criteria = getSession().createCriteria(ValidationsType.class);
        criteria.add(Restrictions.eq("name", value));
        return (ValidationsType) criteria.uniqueResult();
    }

}
