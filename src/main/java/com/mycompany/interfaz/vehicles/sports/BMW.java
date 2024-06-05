package com.mycompany.interfaz.vehicles.sports;

import com.mycompany.interfaz.vehicles.Convertible;
import com.mycompany.interfaz.vehicles.Turbo;
import com.mycompany.interfaz.vehicles.Vehicles;

public class BMW extends Vehicles implements Turbo, Convertible{

    public BMW(String brand, String color, int doorsQtty) {
        super(brand, color, doorsQtty);
    }
    
    @Override
    public void addTurbo(){
        System.out.println("Nitro añadido");
    }
    
    @Override
    public void superTurbo() {
        System.out.println("A vola!!!");;
    }
    
    @Override
    public void openCeiling(){
        System.out.println("Abriendo el techo");
    }
}
