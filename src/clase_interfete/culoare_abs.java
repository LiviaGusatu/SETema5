package clase_interfete;
import clase.alb;
import clase.negru;
import interfete.model;
import interfete.culoare;
/**
 * Created by Livia on 11/16/2014.
 * clasa care mosteneste clasa abstracta
 */
public class culoare_abs extends ClassAbs {

    @Override
    public culoare get_culoare(String c){
        if(c==null)
            return null;
        if(c.equalsIgnoreCase("negru"))
            return new negru();
        if(c.equalsIgnoreCase("alb"))
            return new alb();
        return null;
    }

    @Override
    public model get_model(String m) {
        return null;
    }
}

