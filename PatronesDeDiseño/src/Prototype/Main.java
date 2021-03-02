/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 ** Definicion:
 * El patrón de diseño Prototype sirve para crear clonaciones de objetos (instancias de clases) 
 * a fin de no acarrear todo lo que lleva la creación del mismo desde cero, parámetros, métodos 
 * a ejecutar, etc. Hay que tener en cuenta que clonar un objeto es mucho mas rápido que crearlo.
 * 
 * @author Jose
 */
public class Main {
    public static void main(String[] args){
       
        CuentaSimple cuenta = new CuentaSimple("Visa", 200);
        CuentaSimple clonada = (CuentaSimple) cuenta.clonar();
        CuentaSimple clonada2 = (CuentaSimple) cuenta.clonar();
        clonada.setMonto(20);
        
        //Mostramos datos de cuentas
        System.out.println(cuenta.toString());
        System.out.println(clonada.toString());
        System.out.println(clonada2.toString());
        
        //Verificamos si realmente son distintas
        System.out.println(clonada == cuenta || clonada2 == cuenta);
        
        
       
    }
    
   
    
}
