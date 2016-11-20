package barreiralarrañaga.Dominio;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

public class Evaluacion implements Serializable{

    private Cliente cliente;
    private String resenia;
    private int estrellas;
    private Date fechaEvaluacion;

    public Evaluacion() {
        cliente = new Cliente();
        resenia = "Sin reseña";
        estrellas = 0;
        fechaEvaluacion = Date.from(Instant.MIN);
    }

    public Evaluacion(Cliente clie, int calif, String reseniaIngresada) {
        cliente = clie;
        resenia = reseniaIngresada;
        if (reseniaIngresada.equals("")) {
            resenia = "Sin Reseña";
        }

        estrellas = calif;

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
