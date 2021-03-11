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
public class FiatBuilder extends AutoBuilder{
    
    @Override
    public void buildMotor(){
        Motor motor = new Motor();
        motor.setNumero(2132);
        motor.setPotencia("Pot 2");
        auto.setMotor(motor);
    }
    
    @Override
    public void buildModelo(){
        auto.setModelo("Palio");
    }
    
    @Override
    public void buildMarca(){
        auto.setMarca("Fiat");
    }
    
    @Override
    public void buildPuertas(){
        auto.setCantidadDePuertas(4);
    }
}
