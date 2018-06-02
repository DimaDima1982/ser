 package com.service.intefaces;


 import com.entity.ValidationManualData;

 import java.util.List;

 public interface ValidationManualDataInterfaceService extends InterfaceService <ValidationManualData> {
    @Override
    void save(ValidationManualData obj);

    @Override
    List<ValidationManualData> findAll();

    @Override
    ValidationManualData findByField(String field, String value);

    @Override
    ValidationManualData findById(int id);

    @Override
    void deleteById(int id);
}
