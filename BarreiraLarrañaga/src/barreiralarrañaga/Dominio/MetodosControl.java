/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barreiralarrañaga.Dominio;

/**
 *
 * @author Juan
 */
public class MetodosControl { 
    public boolean validInt(String numero){
    boolean esValido= true;
    try {
    int test = Integer.parseInt(numero);
    
    }catch(NumberFormatException e){
      
        esValido = false;}
    return esValido;
    }
}
