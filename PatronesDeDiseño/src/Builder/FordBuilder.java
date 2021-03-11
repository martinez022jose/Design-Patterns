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
public class FordBuilder extends AutoBuilder{
    
    @Override
    public void buildMotor(){
        Motor motor = new Motor();
        motor.setNumero(21324);
        motor.setPotencia("Pot 1");
        auto.setMotor(motor);
    }
    
    @Override
    public void buildModelo(){
        auto.setModelo("Palio2");
    }
    
    @Override
    public void buildMarca(){
        auto.setMarca("Ford");
    }
    
    @Override
    public void buildPuertas(){
        auto.setCantidadDePuertas(4);
    }
    
    
    
}
