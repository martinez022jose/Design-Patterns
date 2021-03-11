/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/** El patrón Singleton tiene  como objetivo limitar el número de instancias de una clase
 *
 * @author Jose
 */
public class Main {
    public static void main(String[] args){
        Instituto instituto = Instituto.getInstance();
        instituto.setNombre("Nombre 1");
        
        Instituto instituto2 = Instituto.getInstance();
        instituto2.setNombre("Nombre 2");
        
        System.out.println(instituto.getNombre());
        
        System.out.println(instituto == instituto2);
        
    }
}
