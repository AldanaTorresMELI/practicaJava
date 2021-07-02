package PrincipiosJava.Clase4.SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private Integer id = 0; //contador
    private HashMap<Integer, List<Prenda>>  diccionario = new HashMap<Integer, List<Prenda>>();

    public GuardaRopa(){
        this.diccionario = new HashMap<Integer, List<Prenda>>();
    }
    public GuardaRopa(Integer id, HashMap<Integer, List<Prenda>> diccionario) {
        this.id = id;
        this.diccionario = diccionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<Integer, List<Prenda>> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<Integer, List<Prenda>> diccionario) {
        this.diccionario = diccionario;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        id++;
        diccionario.put(id, listaDePrenda);
        System.out.println("Su código para retirar sus prendas es: " + id);
        return id;
    }

    //ver
    public void mostrarPrendas(){
        for(Map.Entry<Integer, List<Prenda>> i:diccionario.entrySet()){
            System.out.println("-------------------------");
            System.out.println("Id: " + i.getKey() + " : ");
            i.getValue().forEach(System.out::println);
            System.out.println("-------------------------");
        }
    }

    public List<Prenda> devolverPrendas(Integer number){
        List<Prenda> devolver = diccionario.get(number);
        diccionario.remove(number);
        System.out.println("Retiraste tus prendas");
        return devolver;
    }
}
