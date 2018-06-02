package com.dao.intefaces;

import com.entity.ValidationsType;

import java.util.List;

public interface ValidationsTypeInterfaceDao extends InterfaceDao <ValidationsType> {
    @Override
    void save(ValidationsType object);

    @Override
    List<ValidationsType> findAll();

    @Override
    ValidationsType findById(int id);

    @Override
    void deleteById(int id);

    @Override
    ValidationsType findByField(String field, String value);
}
