package com.dao.intefaces;


import com.entity.Validation;

import java.util.List;

public interface ValidationInterfaceDao extends InterfaceDao<Validation> {
    @Override
    void save(Validation object);

    @Override
    List<Validation> findAll();

    @Override
    Validation findById(int id);

    @Override
    void deleteById(int id);

    @Override
    Validation findByField(String field, String value);
}
