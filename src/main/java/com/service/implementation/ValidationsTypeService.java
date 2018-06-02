 package com.service.implementation;


import com.dao.intefaces.ValidationsTypeInterfaceDao;
import com.entity.ValidationsType;
import com.service.intefaces.ValidationsTypeInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class ValidationsTypeService implements ValidationsTypeInterfaceService {

    @Autowired
    private ValidationsTypeInterfaceDao validationsTypeInterfaceDao;

    public void save(ValidationsType obj) {
        validationsTypeInterfaceDao.save(obj);
    }

    public List<ValidationsType> findAll() {
        return validationsTypeInterfaceDao.findAll();
    }

    public ValidationsType findById(int id) {
        return (ValidationsType)validationsTypeInterfaceDao.findById(id);
    }

    public void deleteById(int id) {
        validationsTypeInterfaceDao.deleteById(id);
    }

    public ValidationsType findByField(String field, String value){
        return (ValidationsType)validationsTypeInterfaceDao.findByField(field, value);
    }
}
