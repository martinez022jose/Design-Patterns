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
public class Motor {
    private int numero;
    private String potencia;
    
    public Motor(){
    
    }

    public int getNumero() {
        return numero;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
      
}
