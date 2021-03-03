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
public class FacturaIva extends Factura{
    @Override 
    public double getImporteIva(){
        return this.getImporte() * 20;
    }
}
