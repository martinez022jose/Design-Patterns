/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Jose
 */
public class CuentaSimple implements ICuenta{
    
    private String desc;
    private double monto;
    
    public CuentaSimple(String desc, double monto){
        this.desc = desc;
        this.monto = monto;
        
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "CuentaSimple{" + "desc=" + desc + ", monto=" + monto + '}';
    }
 
    @Override
    public ICuenta clonar(){
        CuentaSimple cuenta = null;
        try{
            cuenta = (CuentaSimple) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
        
    }
}
