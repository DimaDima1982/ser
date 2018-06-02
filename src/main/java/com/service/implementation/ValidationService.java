 package com.service.implementation;

import com.dao.intefaces.ValidationInterfaceDao;
import com.entity.Validation;
import com.service.intefaces.ValidationInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class ValidationService implements ValidationInterfaceService {
    @Autowired
    private ValidationInterfaceDao validationInterfaceDao;

    public void save(Validation obj) {
        validationInterfaceDao.save(obj);
    }

    public List<Validation> findAll() {
        return validationInterfaceDao.findAll();
    }

    public Validation findById(int id) {
        return (Validation)validationInterfaceDao.findById(id);
    }

    public void deleteById(int id) {
        validationInterfaceDao.deleteById(id);
    }

    public Validation findByField(String field, String value){
        return (Validation)validationInterfaceDao.findByField(field, value);
    }
}
