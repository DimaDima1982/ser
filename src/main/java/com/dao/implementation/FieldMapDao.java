package com.dao.implementation;



import com.dao.intefaces.FieldMapInterfaceDao;
import com.entity.FieldMap;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("FieldMapInterfaceDao")
public class FieldMapDao extends AbstractDao implements FieldMapInterfaceDao {


    public void save(FieldMap object) {
        persist(object);
    }

    public List<FieldMap> findAll() {
        Criteria criteria = getSession().createCriteria(FieldMap.class);
        return (List<FieldMap>)criteria.list();
    }

    public FieldMap findById(int id) {
        Criteria criteria = getSession().createCriteria(FieldMap.class);
        criteria.add(Restrictions.eq("id", id));
        return (FieldMap)criteria.uniqueResult();
    }

    public void deleteById(int id) {
        Query query = getSession().createQuery("delete from  FieldMap   where id = :id");
        query.setInteger("id",id);
        query.executeUpdate();

    }

    public FieldMap findByField(String field, String value) {
        Criteria criteria = getSession().createCriteria(FieldMap.class);
        criteria.add(Restrictions.eq("name", value));
        return (FieldMap)criteria.uniqueResult();
    }
}
