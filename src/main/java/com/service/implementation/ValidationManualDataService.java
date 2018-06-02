 package com.service.implementation;


import com.dao.intefaces.ValidationManualDataInterfaceDao;
import com.entity.ValidationManualData;
import com.service.intefaces.ValidationManualDataInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class ValidationManualDataService implements ValidationManualDataInterfaceService {
    @Autowired
    private ValidationManualDataInterfaceDao validationManualDataInterfaceDao;

    public void save(ValidationManualData obj) {
        validationManualDataInterfaceDao.save(obj);
    }

    public List<ValidationManualData> findAll() {
        return validationManualDataInterfaceDao.findAll();
    }

    public ValidationManualData findById(int id) {
        return (ValidationManualData)validationManualDataInterfaceDao.findById(id);
    }

    public void deleteById(int id) {
        validationManualDataInterfaceDao.deleteById(id);
    }

    public ValidationManualData findByField(String field, String value){
        return (ValidationManualData)validationManualDataInterfaceDao.findByField(field, value);
    }
}
