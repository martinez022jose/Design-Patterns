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
public class AutoGasolina extends Auto{
    
    public AutoGasolina(String model, String color, int potencia, double espacio) {
        super(model, color, potencia, espacio);
    }

    @Override
    public void mostrarCarateristicas() {
        System.out.println("Auto{" + "model=" + this.getModel()+ ", color=" + this.getColor() + ", potencia=" + this.getPotencia() + 
                ", espacio=" + this.getEspacio() + '}');
    }
}
