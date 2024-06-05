package com.mycompany.interfaz;

import com.mycompany.interfaz.vehicles.classics.Renault4;
import com.mycompany.interfaz.vehicles.sports.BMW;

public class Interfaz {

    public static void main(String[] args) {
        
        BMW bmw = new BMW("BMW", "Blanco y azul", 2);
                
        bmw.addTurbo();
        bmw.openCeiling();
        bmw.run();
        
        Renault4 renault4 = new Renault4("Renauult4", "Azul", 4);
        renault4.openCeiling();
        renault4.run();
    }
}
