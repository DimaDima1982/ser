 package com.service.implementation;


import com.dao.intefaces.FieldMapInterfaceDao;
import com.entity.FieldMap;
import com.service.intefaces.FieldMapInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
public class FieldMapService implements FieldMapInterfaceService {

    @Autowired
    private FieldMapInterfaceDao fieldMapInterfaceDao;

    public void save(FieldMap obj) {
        fieldMapInterfaceDao.save(obj);
    }

    public List<FieldMap> findAll() {
        return fieldMapInterfaceDao.findAll();
    }

    public FieldMap findById(int id) {
        return (FieldMap)fieldMapInterfaceDao.findById(id);
    }

    public void deleteById(int id) {
        fieldMapInterfaceDao.deleteById(id);
    }

    public FieldMap findByField(String field, String value){
        return (FieldMap)fieldMapInterfaceDao.findByField(field, value);
    }
}
