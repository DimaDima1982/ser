 package com.service.intefaces;

import java.util.List;

public interface InterfaceService <T> {
    void save(T obj);
    List<T> findAll();
    T findByField(String field, String value);
    T findById(int id);
    void deleteById(int id);



}
