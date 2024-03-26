package ext;

import dao.IDAO;

public class DaoImplVWS implements IDAO {
    public double getData() {
        System.out.println("vesion web service");
        
        return 90;
    }
}
