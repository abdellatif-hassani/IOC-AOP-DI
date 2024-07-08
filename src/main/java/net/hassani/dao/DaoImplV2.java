package net.hassani.dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Web Service Version");
        return 10;
    }
}
