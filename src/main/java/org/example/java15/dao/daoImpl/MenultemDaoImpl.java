package org.example.java15.dao.daoImpl;

import org.example.java15.dao.MenultemDao;
import org.example.java15.db.Database;
import org.example.java15.model.Menultem;

public class MenultemDaoImpl implements MenultemDao {
    private final Database database;

    public MenultemDaoImpl(Database database) {
        this.database = database;
    }


    @Override
    public String save(Menultem menuItem) {
        database.menultems.add(menuItem);
        return "Successfully saved";
    }
}
