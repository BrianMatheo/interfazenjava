package com.mycompany.interfaz.vehicles.classics;

import com.mycompany.interfaz.vehicles.Convertible;
import com.mycompany.interfaz.vehicles.Vehicles;

public class Renault4 extends Vehicles implements Convertible{

    public Renault4(String brand, String color, int doorsQtty) {
        super(brand, color, doorsQtty);
    }
    
    @Override
    public void openCeiling(){
        System.out.println("Soy Cool!!!");
    }
}
