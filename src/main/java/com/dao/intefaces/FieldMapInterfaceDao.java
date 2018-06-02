package com.dao.intefaces;


import com.entity.FieldMap;

import java.util.List;

public interface FieldMapInterfaceDao extends InterfaceDao <FieldMap> {
    @Override
    void save(FieldMap object);

    @Override
    List<FieldMap> findAll();

    @Override
    FieldMap findById(int id);

    @Override
    void deleteById(int id);

    @Override
    FieldMap findByField(String field, String value);
}
