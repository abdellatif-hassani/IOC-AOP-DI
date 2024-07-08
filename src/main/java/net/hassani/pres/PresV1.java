package net.hassani.pres;

import net.hassani.dao.DaoImpl;
import net.hassani.dao.DaoImplV2;
import net.hassani.dao.IDao;
import net.hassani.metier.MetierImpl;

public class PresV1 {
    public static void main(String[] args) {
        // Injection des dépandances via l'instanciation statique
        IDao dao = new DaoImplV2();
        // Injection des dépendances via le constructeur
        MetierImpl metier = new MetierImpl(dao);
        //Injection des dépendances via le setter
//        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
