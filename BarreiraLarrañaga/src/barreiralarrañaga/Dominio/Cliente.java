package barreiralarrañaga.Dominio;

public class Cliente {

    private int idCliente;
    private String nombreCliente;
    private String emailCliente;

    public Cliente() {
        idCliente = -1;
        nombreCliente = "Sin nombre";
        emailCliente = "Sin email";
    }

    public Cliente(int elIdCliente, String elNombreCliente, String elEmailCliente) {
        this.idCliente = elIdCliente;
        this.nombreCliente = elNombreCliente;
        this.emailCliente = elEmailCliente;
    }
   
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
