package barreiralarrañaga;

import barreiralarrañaga.Dominio.Sistema;
import barreiralarrañaga.Interfaz.Principal;
import java.awt.Rectangle;

public class Inicio {
    public static void main(String[] args) throws ClassNotFoundException {
       Sistema sis = new Sistema();
       Principal menu = new Principal(sis);
        Rectangle rct = menu.getGraphicsConfiguration().getBounds();
        menu.setLocation((rct.width - menu.getWidth()) / 2, (rct.height - menu.getHeight()) / 2);
        menu.setVisible(true);
    }
    
}
