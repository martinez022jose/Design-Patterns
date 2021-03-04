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
public class FabricaAutosElectricos implements FabricaDeAutos{
    
    @Override
    public Auto createAuto(String model, String color, int potencia, double espacio){
        return new AutoElectrico(model,color,potencia,espacio);
    }
    
    @Override
    public Scooter createScooter(String model, String color, int potencia){
        return new ScooterElectrico(model,color,potencia);
    }
    
}
