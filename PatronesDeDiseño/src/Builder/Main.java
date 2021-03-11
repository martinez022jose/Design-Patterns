/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 * El patron Builder permite la creación de un objeto complejo, a partir de una variedad de partes que contribuyen individualmente 
 * a la creación y ensamblación del objeto mencionado.Hace uso de la frase "divide y conquistarás".
 * 
 * @author Jose
 */
public class Main {
    public static void main(String args[]){
        AutoDirector director = new AutoDirector();
        
        director.setAutobuilder(new FordBuilder());
        director.constructAuto();
        
        Auto auto = director.getAuto();
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
        
        
    }
}
