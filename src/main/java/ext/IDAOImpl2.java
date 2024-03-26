package ext;

import dao.IDAO;

public class IDAOImpl2 implements IDAO {
    @Override
    public double getData() {
        System.out.println("vesion capteur");
        double temp=6000;
        return temp;
    }
}
