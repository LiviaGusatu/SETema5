package clase_interfete;
import clase.opel;
import clase.toyota;
import interfete.model;
import interfete.culoare;

/**
 * Created by Livia on 11/16/2014.
 * clasa care mosteneste clasa abstracta
 */
public  class model_abs extends ClassAbs {


    @Override
    public model get_model(String m){
        if(m==null)
            return null;
        if(m.equalsIgnoreCase("opel"))
            return new opel();
        if(m.equalsIgnoreCase("toyota"))
            return new toyota();
        return null;
    }
    @Override
    public culoare get_culoare(String c){
        return null;
    }

}
