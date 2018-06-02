 package com.service.intefaces;


 import com.entity.ValidationsType;

 import java.util.List;

 public interface ValidationsTypeInterfaceService extends InterfaceService <ValidationsType> {
    @Override
    void save(ValidationsType obj);

    @Override
    List<ValidationsType> findAll();

    @Override
    ValidationsType findByField(String field, String value);

    @Override
    ValidationsType findById(int id);

    @Override
    void deleteById(int id);
}
