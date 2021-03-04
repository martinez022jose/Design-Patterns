/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**El patrón Abstract Factory tiene como objetivo la creación de objectos agrupados en familias, 
 * sin tener que conocer las clase concretas destinada a la creación de objetos.
 *
 * @author Jose
 */
public class Main {
    public static void main(String [] args){
        FabricaAutosElectricos fabrica1 = new FabricaAutosElectricos();
        Auto auto1 = fabrica1.createAuto("Ford", "negro", 100, 10);
        Auto auto2 = fabrica1.createAuto("Toyota","blanco",100, 20);
        
        auto1.mostrarCarateristicas();
        auto2.mostrarCarateristicas();
    }
}
