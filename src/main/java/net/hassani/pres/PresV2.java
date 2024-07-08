package net.hassani.pres;

import net.hassani.dao.IDao;
import net.hassani.metier.IMetier;

import java.io.InputStream;
import java.util.Scanner;

public class PresV2 {
    public static void main(String[] args) {
        // Injection des dépandances via l'instanciation dynamique
        try {
            InputStream inputStream = PresV2.class.getClassLoader().getResourceAsStream("config.txt");
            Scanner scanner = new Scanner(inputStream);

            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
            System.out.println(metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
