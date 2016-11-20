package barreiralarrañaga;

import barreiralarrañaga.Dominio.Sistema;

import barreiralarrañaga.Interfaz.InicioUI;
import java.awt.Rectangle;

public class Inicio {
    public static void main(String[] args) throws ClassNotFoundException {
       Sistema sis = new Sistema();
     
        InicioUI test = new InicioUI(sis);
        test.setVisible(true);
      
    }
    
}
