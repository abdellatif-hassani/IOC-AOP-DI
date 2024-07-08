package net.hassani.pres;

import net.hassani.metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.hassani");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
