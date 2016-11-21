package barreiralarrañaga.Dominio;

import java.io.Serializable;

public class Cliente implements Serializable {

    //atributos
    private String nombreCliente;
    private String emailCliente;

    //constructores
    public Cliente() {
        nombreCliente = "Sin nombre";
        emailCliente = "Sin email";
    }

    public Cliente(String elNombreCliente, String elEmailCliente) {
        this.nombreCliente = elNombreCliente;
        this.emailCliente = elEmailCliente;
    }

    //get's y set's
    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public String getEmailCliente() {
        return this.emailCliente;
    }

    public void setNombreCliente(String elNombreCliente) {
        this.nombreCliente = elNombreCliente;
    }

    public void setEmailCliente(String elEmailCliente) {
        this.emailCliente = elEmailCliente;
    }

    @Override
    public boolean equals(Object o) {
        Cliente aux = (Cliente) o;
        return this.emailCliente.equals(aux.getEmailCliente());
    }

}
