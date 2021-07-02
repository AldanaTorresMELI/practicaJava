package PrincipiosJava.Clase4.Dakar.Entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrera {
    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantidadVPermitidos;
    private List<Vehiculo> listVehiculos;
    private SocorristaAuto lifeGuardCar;
    private SocorristaMoto lifeGuardMoto;

    public Carrera(double distancia, double premioEnDolares, String nombre, int cantidadVPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadVPermitidos = cantidadVPermitidos;
        this.listVehiculos = new ArrayList<>();
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadVPermitidos() {
        return cantidadVPermitidos;
    }

    public void setCantidadVPermitidos(int cantidadVPermitidos) {
        this.cantidadVPermitidos = cantidadVPermitidos;
    }

    public List<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(List<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    public SocorristaAuto getLifeGuardCar() {
        return lifeGuardCar;
    }

    public void setLifeGuardCar(SocorristaAuto lifeGuardCar) {
        this.lifeGuardCar = lifeGuardCar;
    }

    public SocorristaMoto getLifeGuardMoto() {
        return lifeGuardMoto;
    }

    public void setLifeGuardMoto(SocorristaMoto lifeGuardMoto) {
        this.lifeGuardMoto = lifeGuardMoto;
    }

    public void addCar(double velocidad, double aceleracion, int anguloDeGiro, String patente){
        if(hayCupo() == true) listVehiculos.add(new Auto(velocidad,aceleracion,anguloDeGiro,patente));
        else {
            throw new Error("You can't add more vehicles to this race");
        }
    }

    public void addMoto(double velocidad,double aceleracion,int anguloDeGiro,String patente){
        if(hayCupo() == true) listVehiculos.add(new Moto(velocidad,aceleracion,anguloDeGiro,patente));
        else {
            throw new Error("You can't add more vehicles to this race");
        }
    }

    private boolean hayCupo(){
        boolean cupo = false;
        if(cantidadVPermitidos>listVehiculos.size()) cupo = true;
        return cupo;
    }

    public void removeVehicle(Vehiculo vehicle){
       boolean result = listVehiculos.remove(vehicle);
       if(result) System.out.println("Vehicle has been removed");
       else{
           throw new Error("This vehicle doesn't exist");
       }
    }

    public void removeVehicleByPatent(String patent){
        var filteredVehicle = listVehiculos.stream().filter(vehiculo -> vehiculo.getPatente().equals(patent)).findFirst();
        if(filteredVehicle.isPresent()) {
            listVehiculos.remove(filteredVehicle.get());
            System.out.println("Vehicle has been removed");
        }else{
                throw new Error("This vehicle doesn't exist");
            }
    }

    public void getWinner(){
        var a = listVehiculos.stream().max(Comparator.comparing(Vehiculo::isWinner));
        System.out.println(a.toString());
    }

    public void printVehicles(){
        for (Vehiculo vehicle:listVehiculos) {
            System.out.println(vehicle.toString());
        }
    }

    public void helpCar(String patent){
        var filteredVehicle = listVehiculos.stream().filter(vehicle -> vehicle.getPatente().equals(patent)).findFirst();
        if (filteredVehicle.isPresent()){
            if (isCar(filteredVehicle.get())){
                Auto car = (Auto) filteredVehicle.get();
                lifeGuardCar.socorrer(car);
            }else{
                System.out.println("Este socorrista no puede ayudar una moto");
            }
        } else{
            System.out.println("No existe este auto");
        }

    }

    public  void helpMoto(String patent){
        var filteredVehicle = listVehiculos.stream().filter(vehicle -> vehicle.getPatente().equals(patent)).findFirst();
        if (filteredVehicle.isPresent()){
            if (!isCar(filteredVehicle.get())){
                Moto moto = (Moto) filteredVehicle.get();
                lifeGuardMoto.socorrer(moto);
            }else{
                System.out.println("Este socorrista no puede ayudar un auto");
            }
        } else{
            System.out.println("No existe esta moto");
        }
    }

    private boolean isCar(Vehiculo vehicle){
        return vehicle.getRuedas() == 4;
    }
}
