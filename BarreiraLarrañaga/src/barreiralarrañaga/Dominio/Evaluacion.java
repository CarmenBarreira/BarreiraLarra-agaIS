
package barreiralarrañaga.Dominio;

public class Evaluacion {
    private Cliente cliente;
    private Restaurante restaurante; 
    private String resenia; 
    private int estrellas;
    private String fechaEvaluacion; 

    public Evaluacion() {
        cliente = new Cliente();
        restaurante = new Restaurante();
        resenia = "Sin resenia";
        estrellas = 0;
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

    public String getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setRestaurante(Restaurante elRestaurante) {
        this.restaurante = elRestaurante;
    }

    public void setResenia(String laResenia) {
        this.resenia = laResenia;
    }

    public void setEstrellas(int lasEstrellas) {
        this.estrellas = lasEstrellas;
    }
   
    
}
