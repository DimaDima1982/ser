package com.dao.intefaces;


import com.entity.ValidationManualData;

import java.util.List;

public interface ValidationManualDataInterfaceDao extends InterfaceDao <ValidationManualData> {
    @Override
    void save(ValidationManualData object);

    @Override
    List<ValidationManualData> findAll();

    @Override
    ValidationManualData findById(int id);

    @Override
    void deleteById(int id);

    @Override
    ValidationManualData findByField(String field, String value);
}
