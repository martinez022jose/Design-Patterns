/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Jose
 */
public class Instituto {
    private static Instituto instance;
    private String nombre;
    
    private Instituto(){
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public static Instituto getInstance(){
        if(instance == null){
            instance = new Instituto();
        }
        
        return instance;
    }
}
