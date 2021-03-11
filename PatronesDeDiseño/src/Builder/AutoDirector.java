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
public class AutoDirector {
    private AutoBuilder autoBuilder;
    
    public void constructAuto(){
        autoBuilder.createAuto();
        autoBuilder.buildMotor();
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildPuertas();
    }
    
    public void setAutobuilder(AutoBuilder ab){
        autoBuilder = ab;
        
    }
    public Auto getAuto(){
        return autoBuilder.getAuto();
    }
}
