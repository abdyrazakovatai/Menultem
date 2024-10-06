package org.example.java15;

import org.example.java15.dao.daoImpl.MenultemDaoImpl;
import org.example.java15.db.Database;
import org.example.java15.model.Menultem;
import org.example.java15.service.MenultemService;
import org.example.java15.service.serviceImpl.MenultemServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        MenultemDaoImpl menultemDao = new MenultemDaoImpl(db);
        MenultemService menultemService = new MenultemServiceImpl(menultemDao);

        Menultem plov  =new Menultem(1L,"Plov", "plov.jpg", BigDecimal.valueOf(450), "Traditional Uzbek rice dish with lamb, carrots, and spices.", false);
        Menultem lagman = new Menultem(2L,"Lagman", "lagman.jpg", BigDecimal.valueOf(480), "Hand-pulled noodles in a rich meat and vegetable broth.", false);
        Menultem samsa = new Menultem(3L,"Samsa", "samsa.jpg", BigDecimal.valueOf(150), "Flaky pastry filled with spiced meat or pumpkin.", false);
        Menultem dolma = new Menultem(4L,"Dolma", "dolma.jpg", BigDecimal.valueOf(600), "Grape leaves stuffed with rice, herbs, and sometimes meat.", true);
        Menultem baklava = new Menultem(5L,"Baklava", "baklava.jpg", BigDecimal.valueOf(750), "Sweet pastry with layers of filo dough, honey, and nuts.", true);


        menultemService.save(plov);
        menultemService.save(lagman);
        menultemService.save(samsa);
        menultemService.save(dolma);
        menultemService.save(baklava);

    }
}