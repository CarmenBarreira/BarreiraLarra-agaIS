
package barreiralarrañaga.Dominio;

public class Evaluacion {
    private Cliente cliente;
    private Restaurante restaurante; 
    private String resenia; 
    private int estrellas;

    public Evaluacion() {
        cliente = new Cliente();
        restaurante = new Restaurante();
        resenia = "";
        estrellas = 0;        
    }

        
    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public String getResenia() {
        return resenia;
    }

    public int getEstrellas() {
        return estrellas;
    }
    
    
}
