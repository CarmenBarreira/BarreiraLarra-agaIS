package barreiralarrañaga;

import barreiralarrañaga.Dominio.Sistema;

import barreiralarrañaga.Interfaz.InicioUI;

public class Inicio {
    public static void main(String[] args) throws ClassNotFoundException {
       //Creamos la instancia de sistema
       Sistema sis = new Sistema();
     
       InicioUI test = new InicioUI(sis);
       test.setVisible(true);      
    }
    
}
