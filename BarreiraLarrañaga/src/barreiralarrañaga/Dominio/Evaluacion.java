package barreiralarrañaga.Dominio;

import java.time.Instant;
import java.util.Date;

public class Evaluacion {
    private Cliente cliente;
    private String resenia; 
    private int estrellas;
    private Date fechaEvaluacion; 

    public Evaluacion() {
        cliente = new Cliente();
        resenia = "Sin resenia";
        estrellas = 0;
        fechaEvaluacion= Date.from(Instant.MIN);
    }
    
    public Evaluacion(Cliente clie,  int calif, String reseniaIngresada) {
        cliente = clie;
        resenia = reseniaIngresada;
        estrellas = calif;
        fechaEvaluacion= Date.from(Instant.MIN);
    }
    
    public String getResenia() {
        return resenia;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setResenia(String laResenia) {
        this.resenia = laResenia;
    }

    public void setEstrellas(int lasEstrellas) {
        this.estrellas = lasEstrellas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    
    public void setCliente(Cliente elCliente) {
        this.cliente = elCliente;
    }

    
    public Date getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(Date laFechaEvaluacion) {
        this.fechaEvaluacion = laFechaEvaluacion;
    }
      
}
