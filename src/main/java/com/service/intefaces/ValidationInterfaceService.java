 package com.service.intefaces;


 import com.entity.Validation;

 import java.util.List;

 public interface ValidationInterfaceService extends InterfaceService <Validation> {
    @Override
    void save(Validation obj);

    @Override
    List<Validation> findAll();

    @Override
    Validation findByField(String field, String value);

    @Override
    Validation findById(int id);

    @Override
    void deleteById(int id);
}
