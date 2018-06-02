package com.dao.intefaces;


import com.entity.TabMapXLSX;

import java.util.List;

public interface TabMapXLSXInterfaceDao extends InterfaceDao <TabMapXLSX> {
    @Override
    void save(TabMapXLSX object);

    @Override
    List<TabMapXLSX> findAll();

    @Override
    TabMapXLSX findById(int id);

    @Override
    void deleteById(int id);

    @Override
    TabMapXLSX findByField(String field, String value);
}
