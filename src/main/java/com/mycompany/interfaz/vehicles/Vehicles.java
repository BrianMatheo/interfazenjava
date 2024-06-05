package com.mycompany.interfaz.vehicles;
public class Vehicles {
    private String brand;
    private String color;
    private int doorsQtty;

    public Vehicles(String brand, String color, int doorsQtty) {
        this.brand = brand;
        this.color = color;
        this.doorsQtty = doorsQtty;
    }
    
    public void run(){
        System.out.println("Carro andando \n");
    }
    
    
}
