package com.dao.implementation;

import com.dao.intefaces.ValidationManualDataInterfaceDao;
import com.entity.ValidationManualData;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ValidationManualDataInterfaceDao")
public class ValidationManualDataDao extends AbstractDao implements ValidationManualDataInterfaceDao {
    public void save(ValidationManualData object) {
        persist(object);
    }

    public List<ValidationManualData> findAll() {
        Criteria criteria = getSession().createCriteria(ValidationManualData.class);
        return (List<ValidationManualData>)criteria.list();
    }

    public ValidationManualData findById(int id) {
        Criteria criteria = getSession().createCriteria(ValidationManualData.class);
        criteria.add(Restrictions.eq("id", id));
        return (ValidationManualData)criteria.uniqueResult();
    }

    public void deleteById(int id) {
        Query query = getSession().createQuery("delete from  ValidationManualData   where id = :id");
        query.setInteger("id",id);
        query.executeUpdate();

    }

    public ValidationManualData findByField(String field, String value) {
        Criteria criteria = getSession().createCriteria(ValidationManualData.class);
        criteria.add(Restrictions.eq("name", value));
        return (ValidationManualData)criteria.uniqueResult();
    }
}
