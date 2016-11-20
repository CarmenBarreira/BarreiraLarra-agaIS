package barreiralarrañaga.Dominio;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

public class Evaluacion implements Serializable{

    //Atributos
    private Cliente cliente;
    private String resenia;
    private int estrellas;
    private Date fechaEvaluacion;

    //Constructores
    public Evaluacion() {
        cliente = new Cliente();
        resenia = "Sin reseña";
        estrellas = 0;
       // fechaEvaluacion = Date.from(Instant.MIN);
    }

    public Evaluacion(Cliente clie, int calif, String reseniaIngresada) {
        cliente = clie;
        resenia = reseniaIngresada;
        if (reseniaIngresada.equals("")) {
            resenia = "Sin Reseña";
        }
        estrellas = calif;
    }

    //get's y set's
    public String getResenia() {
        return this.resenia;
    }

    public int getEstrellas() {
        return this.estrellas;
    }

    public void setResenia(String laResenia) {
        this.resenia = laResenia;
    }

    public void setEstrellas(int lasEstrellas) {
        this.estrellas = lasEstrellas;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente elCliente) {
        this.cliente = elCliente;
    }

    public Date getFechaEvaluacion() {
        return this.fechaEvaluacion;
    }

    public void setFechaEvaluacion(Date laFechaEvaluacion) {
        this.fechaEvaluacion = laFechaEvaluacion;
    }

}
