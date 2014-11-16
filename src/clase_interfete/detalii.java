package clase_interfete;

/**
 * Created by Livia on 11/16/2014.
 */
public class detalii {
    public static ClassAbs get_detalii(String d){
        if(d.equalsIgnoreCase("model"))
            return new model_abs();
        if(d.equalsIgnoreCase("culoare"))
            return new culoare_abs();
        return null;
    }
}
