 package com.service.implementation;



import com.dao.intefaces.TabMapXLSXInterfaceDao;
import com.entity.TabMapXLSX;
import com.service.intefaces.TabMapXLSXInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class TabMapXLSXService implements TabMapXLSXInterfaceService {

    @Autowired
    private TabMapXLSXInterfaceDao tabMapXLSXInterfaceDao;

    public void save(TabMapXLSX obj) {
        tabMapXLSXInterfaceDao.save(obj);
    }

    public List<TabMapXLSX> findAll() {
        return tabMapXLSXInterfaceDao.findAll();
    }

    public TabMapXLSX findById(int id) {
        return (TabMapXLSX)tabMapXLSXInterfaceDao.findById(id);
    }

    public void deleteById(int id) {
        tabMapXLSXInterfaceDao.deleteById(id);
    }

    public TabMapXLSX findByField(String field, String value){
        return (TabMapXLSX)tabMapXLSXInterfaceDao.findByField(field, value);
    }
}
