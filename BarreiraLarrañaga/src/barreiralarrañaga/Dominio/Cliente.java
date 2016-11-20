package barreiralarrañaga.Dominio;

import java.util.Collections;

public class Cliente {

    private int idCliente;
    private String nombreCliente;
    private String emailCliente;

   
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int elIdCliente) {
        this.idCliente = elIdCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String elNombreCliente) {
        this.nombreCliente = elNombreCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String elEmailCliente) {
        this.emailCliente = elEmailCliente;
    }

    @Override
    public boolean equals(Object o) {
        Cliente aux = (Cliente) o;
        return this.idCliente == aux.getIdCliente();

    }

}
