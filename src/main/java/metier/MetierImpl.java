package metier;

import dao.IDAO;
import org.springframework.stereotype.Component;

//couplage faible
@Component("metier")
public class MetierImpl  implements IMetier{
//depend de linterface et nont de la classe
    //@Autowired
  private IDAO dao;
  //injection via le constructeur

    public MetierImpl(IDAO dao) {
        this.dao = dao;
    }

    @Override
    public double calcul()  {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res ;

    }
//injecter dans la variable dao un objet d une classe qui implemente linterface idao
    public void setDao(IDAO dao) {
        this.dao = dao;
    }


}

