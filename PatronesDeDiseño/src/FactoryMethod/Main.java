/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**Factory Method permite la creación de un subtipo determinado por medio de una clase de Factoría, 
 * la cual oculta los detalles de creación del objeto.
 * La intención del Factory Method es tener una clase a la cual delegar la responsabilidad de la creación de los objetos
 *
 * @author Jose
 */
public class Main {
    public static void main(String [] args){
        FacturaFactory factory = new FacturaFactory();
        Factura fac = factory.createFactura("iva reducido");
        fac.setImporte(20);
        
        System.out.println(fac.getImporteIva());
    }
}
