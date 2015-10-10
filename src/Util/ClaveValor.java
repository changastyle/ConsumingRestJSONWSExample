package Util;

/**
 * Created by nicog on 4/10/2015.
 */
public class ClaveValor
{
    private String clave;
    private String valor;

    public ClaveValor(String clave , String valor)
    {
        this.clave = clave;
        this.valor = valor;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
}
