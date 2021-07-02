package PrincipiosJava.Clase4.Dakar;

import PrincipiosJava.Clase4.Dakar.Entities.Carrera;

public class Main {
    public static void main(String[] args) {
        Carrera race = new Carrera(1000,30000,"Dakar",10);
        race.addCar(200,100,30,"AAAA");
        race.addCar(150,100,30,"BBBB");
        race.addCar(100,100,30,"CCCC");
        race.addMoto(150,100,30,"DDDD");
        race.addMoto(250,100,30,"EEEE");
        race.addMoto(210,100,30,"FFFF");
        race.addCar(190,100,30,"GGGG");
        race.getWinner();
        //race.removeVehicleByPatent("ZZZZZ");
        race.printVehicles();
        race.helpCar("EEEE");
        race.helpCar("AAAA");
        race.helpMoto("EEEE");
    }
}