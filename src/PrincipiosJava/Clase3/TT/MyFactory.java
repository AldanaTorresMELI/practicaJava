package PrincipiosJava.Clase3.TT;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(){
        String path = "/Users/aldtorres/IdeaProjects/practica1java/src/MyFactory.properties";
        Object c = new Object();
        try(InputStream input = new FileInputStream(path)) {
            Properties p = new Properties();
            p.load(input);
            String propName = p.getProperty("sorter");
            c = Class.forName(propName).getConstructor().newInstance();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return c;
    }
}