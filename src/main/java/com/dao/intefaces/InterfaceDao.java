package com.dao.intefaces;

import java.util.List;

public interface InterfaceDao<T> {

    void save(T object);

    List<T> findAll();

    T findById(int id);

    void deleteById(int id);

    T findByField(String field, String value);

}
