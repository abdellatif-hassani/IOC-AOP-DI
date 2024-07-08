package net.hassani.pres;

import net.hassani.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSPringXml {
    public static void main(String[] args) {
        //reading config from spring xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println(metier.calcul());
    }
}
