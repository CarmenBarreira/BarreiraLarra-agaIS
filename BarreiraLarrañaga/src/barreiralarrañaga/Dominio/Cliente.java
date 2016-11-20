package barreiralarrañaga.Dominio;

import java.io.Serializable;

public class Cliente  implements Serializable{

    private String nombreCliente;
    private String emailCliente;

    public Cliente() {
        nombreCliente = "Sin nombre";
        emailCliente = "Sin email";
    }

    public Cliente(String elNombreCliente, String elEmailCliente) {

        this.nombreCliente = elNombreCliente;
        this.emailCliente = elEmailCliente;
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
        return this.emailCliente.equals(aux.getEmailCliente());

    }

}
