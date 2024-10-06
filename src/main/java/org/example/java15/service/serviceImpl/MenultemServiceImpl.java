package org.example.java15.service.serviceImpl;

import org.example.java15.dao.daoImpl.MenultemDaoImpl;
import org.example.java15.model.Menultem;
import org.example.java15.service.MenultemService;

public class MenultemServiceImpl implements MenultemService {
        private final MenultemDaoImpl menultemDao;

    public MenultemServiceImpl(MenultemDaoImpl menultemDao) {
            this.menultemDao = menultemDao;
        }


        @Override
        public String save(Menultem menuItem) {
            menultemDao.save(menuItem);
            return "Successfully saved";
        }
    }

