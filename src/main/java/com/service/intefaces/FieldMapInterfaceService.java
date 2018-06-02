 package com.service.intefaces;


 import com.entity.FieldMap;

 import java.util.List;

 public interface FieldMapInterfaceService extends InterfaceService <FieldMap> {
    @Override
    void save(FieldMap obj);

    @Override
    List<FieldMap> findAll();

    @Override
    FieldMap findByField(String field, String value);

    @Override
    FieldMap findById(int id);

    @Override
    void deleteById(int id);
}
