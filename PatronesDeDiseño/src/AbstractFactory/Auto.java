/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Jose
 */
public abstract class Auto {
     private  String  model;
     private  String  color;
     private int  potencia;
     private  double espacio;

    public Auto(String model, String color, int potencia, double espacio) {
        this.model = model;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPotencia() {
        return potencia;
    }

    public double getEspacio() {
        return espacio;
    }
    
    
    
    public  abstract   void  mostrarCarateristicas();
}
