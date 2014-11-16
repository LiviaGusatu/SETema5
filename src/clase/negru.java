package clase;

import interfete.culoare;

/**
 * Created by Livia on 11/16/2014.
 * aceasta clasa este derivata din clasa de baza, "culoare"
 * clasa contine o metoda de afisare
 */
public class negru implements culoare {
    @Override
    public void afisare(){
        System.out.println("s-a apelat metoda afisare() suprascrisa in clasa negru");
    }
}
