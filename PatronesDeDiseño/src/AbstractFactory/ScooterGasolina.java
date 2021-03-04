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
public class ScooterGasolina extends Scooter{
    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCarateristicas() {
        System.out.println("Auto{" + "model=" + this.getModelo()+ ", color=" + this.getColor() + ", potencia=" + this.getPotencia() + '}');
    }
}
