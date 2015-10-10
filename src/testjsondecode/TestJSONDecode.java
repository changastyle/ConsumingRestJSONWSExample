package testjsondecode;

import Util.ClaveValor;
import Util.ObjetoClaveValor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class TestJSONDecode 
{
    public static void main(String[] args) 
    {
        String data = controller.Controller.getDataFromWS("http://localhost:8080/AppEstrellaServer/");
        
        for(Object ob :controller.Controller.parseJSON2Array(data,model.Juego.class))
        {
            System.out.println(ob.toString());
        }
        
        /*for(Object ob : controller.Controller.parseJSON2Object(data, model.Juego.class))
        {
            model.Juego j = (model.Juego) ob;
            System.out.println("" + j.getNombre() );
        }*/
    }
}
