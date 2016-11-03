
package barreiralarrañaga.Dominio;

public class Evaluacion {
    private Cliente cliente;
    private Restaurante restaurante; 
    private String reseña; 
    private int estrellas;

    public Evaluacion() {
        cliente = new Cliente();
        restaurante = new Restaurante();
        reseña = "";
        estrellas = 0;        
    }

        
    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public String getReseña() {
        return reseña;
    }

    public int getEstrellas() {
        return estrellas;
    }
    
    
}
