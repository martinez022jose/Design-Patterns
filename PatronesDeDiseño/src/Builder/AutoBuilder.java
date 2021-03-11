/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Jose
 */
public abstract class AutoBuilder {
    protected Auto auto;

    public Auto getAuto() {
        return auto;
    }
    
    public void createAuto(){
        this.auto = new Auto();
    }
    
    public abstract void buildMotor();
    
    public abstract void buildModelo();
    
    public abstract void buildMarca();
    
    public abstract void buildPuertas();
    
    
    
}
