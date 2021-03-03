/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
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
