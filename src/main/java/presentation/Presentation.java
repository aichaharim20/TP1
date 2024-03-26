package presentation;

import dao.IDAOImpl;
import ext.IDAOImpl2;
import metier.MetierImpl;

public class Presentation {


    public static void main(String[]args){
//couplage fort car nous avons new class depend de classe : injection des dependances par instanciation statique "new"
        IDAOImpl2 dao=new IDAOImpl2();
        IDAOImpl dao1=new IDAOImpl();
        //MetierImpl metier=new MetierImpl();
        //injection via le constructeur avec parametre
        MetierImpl metier=new MetierImpl(dao);
        //injection des dependance
        //metier.setDao(dao);
        System.out.println("Resultat ="+metier.calcul());

    }
}
