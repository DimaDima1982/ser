 package com.service.intefaces;


 import com.entity.TabMapXLSX;

 import java.util.List;

 public interface TabMapXLSXInterfaceService extends InterfaceService <TabMapXLSX> {

    @Override
    void save(TabMapXLSX obj);

    @Override
    List<TabMapXLSX> findAll();

    @Override
    TabMapXLSX findByField(String field, String value);

    @Override
    TabMapXLSX findById(int id);

    @Override
    void deleteById(int id);
}
