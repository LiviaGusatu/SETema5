package clase;
import interfete.model;

/**
 * Created by Livia on 11/16/2014.
 * aceasta clasa este derivata din clasa de baza, "model"
 * clasa contine o metoda de afisare
 */
public class opel implements model {
    @Override
    public void afisare(){
        System.out.println("s-a apelat metoda afisare() suprascrisa in clasa opel");
    }
}
