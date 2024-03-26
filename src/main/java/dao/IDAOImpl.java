package dao;
//couplage faible

import org.springframework.stereotype.Component;

@Component("dao")
public class IDAOImpl  implements IDAO{

    @Override
    public double getData() {
        System.out.println("version base de donnés");
        double tmp =Math.random()*40;

        return tmp;
    }
}
