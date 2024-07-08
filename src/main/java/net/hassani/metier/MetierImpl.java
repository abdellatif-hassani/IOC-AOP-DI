package net.hassani.metier;

import net.hassani.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    private IDao dao;

//    public MetierImpl() {
//    }

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 23;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
