package clase_interfete;
import interfete.model;
import interfete.culoare;

/**
 * Created by Livia on 11/16/2014.
 * functia principala
 */
public class pattern {
    public static void main(String []args) {

        ClassAbs clasa = detalii.get_detalii("model");
        model m1=clasa.get_model("opel");
        m1.afisare();

        clasa=detalii.get_detalii("culoare");
        culoare c1=clasa.get_culoare("negru");
        c1.afisare();
    }

}
