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
public abstract class Factura {
    
    private int id;
    private double importe;

    public int getId() {
        return id;
    }

    public double getImporte() {
        return importe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
    public abstract double getImporteIva();
    
    
    
}
