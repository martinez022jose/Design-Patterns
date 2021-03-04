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
public interface FabricaDeAutos {
    public Auto createAuto(String model, String color, int potencia, double espacio);
    
    public Scooter createScooter(String model, String color, int potencia);
}
