package Util;

import Util.ClaveValor;
import Util.ClaveValor;
import java.util.ArrayList;

/**
 * Created by nicog on 4/10/2015.
 */
public class ObjetoClaveValor
{
    private ArrayList<ClaveValor> arrPropiedades;

    public ObjetoClaveValor()
    {
        arrPropiedades = new ArrayList<ClaveValor>();
    }

    public ArrayList<ClaveValor> getArrPropiedades() {
        return arrPropiedades;
    }

    public void setArrPropiedades(ArrayList<ClaveValor> arrPropiedades) {
        this.arrPropiedades = arrPropiedades;
    }
    public void agregarClaveValor(ClaveValor claveValor)
    {
        this.arrPropiedades.add(claveValor);
    }

    @Override
    public String toString() {
        return "ObjetoClaveValor\n{" +  imprimirArrPropiedades() + "}";
    }

    private String imprimirArrPropiedades() 
    {
        String salida = "\n";
        
        for(ClaveValor claveValor : this.arrPropiedades)
        {
            salida += "     clave :" + claveValor.getClave() + " , valor:"  + claveValor.getValor() + "\n";
        }
        return salida;
    }
    
}
