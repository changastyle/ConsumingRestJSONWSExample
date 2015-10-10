package controller;

import Util.ClaveValor;
import Util.ObjetoClaveValor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller 
{
    public static String getDataFromWS(String urlWS)
    {
        URL url;
        String data = "";
        try
        {
            url = new URL(urlWS);
            if(url != null)
            {
                //1.Traigo los datos del WS a un "Archivo":
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

                //2.Leo el archivo y guardo el contenido en data:
                String linea;
                while(( linea = in.readLine()) != null)
                {
                    data += linea;
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: Controller.getDataFromWS(" + urlWS +")");
        }
        return data;
    }
    public static ArrayList<Object> parseJSON2Object(String jsonData, Class claseAParsear)
    {
        
        ArrayList<Object> arrObjetosJava = new ArrayList<Object>();

        //System.out.println("parseJSONToJava: RECIBO ESTO -> " + jsonData);
        
        Gson gson = new Gson();
        Object obj = gson.fromJson(jsonData, claseAParsear);
        arrObjetosJava.add(obj);
        
        //System.out.println("parseJSONToJava : parsie esto ->" + obj);
        
        return arrObjetosJava;
    }
    public static ArrayList parseJSON2Array(String jsonData, Class claseAParsear)
    {
        ArrayList arr = new ArrayList<>();
        
        JsonParser parser = new JsonParser();
        JsonArray jArray = parser.parse(jsonData).getAsJsonArray();
       //System.out.println("array: " + jArray);
        Gson gson = new Gson();
        
        for(JsonElement obj : jArray )
        {
            Object objGenerico = gson.fromJson( obj , model.Juego.class);
            arr.add(objGenerico);
        }
        
        return arr;
    }
}
