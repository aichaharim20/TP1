package presentation;

import dao.IDAO;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //couplage faible instanciation dynamique
        //lire le fichier conf
        Scanner s =new Scanner(new File("config.txt"));
        String daoClassName= s.nextLine();
        // instanciation dyna cree un objet de type classe
        Class cDao=Class.forName(daoClassName);
//creation de objet quil est de type interface depend de linterface IDAO pour pas dire quellest de quelle type de classe
        IDAO dao=(IDAO) cDao.newInstance();

        String metierClassName=s.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();
        Method method=cMetier.getMethod("setDao", IDAO.class);
        method.invoke(metier,dao);
        System.out.println("Resultat="+metier.calcul());
        //System.out.println(dao.getData());



    }
}