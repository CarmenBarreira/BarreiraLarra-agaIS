package barreiralarrañaga.Dominio;

import java.util.ArrayList;

public class Restaurante {

    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private String tipoComida;
    private ArrayList<Horario> horariosDisponibles;

    public Restaurante() {
        this.nombre = "Sin nombre";
        this.direccion = "Sin direccion";
        this.tipoComida ="ninguna";
        horariosDisponibles = new ArrayList<Horario>();
    }

    public Restaurante(String nombre, String direccion, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoComida = tipoComida;
    }
    
    public void setNombre(String elNombre) {
        this.nombre = elNombre;
    }

    public void setDireccion(String laDireccion) {
        this.direccion = laDireccion;
    }

    public void setTipoComida(String elTipoComida) {
        this.tipoComida = elTipoComida;
    }

    public void setHorariosDisponibles(ArrayList<Horario> losHorariosDisponibles) {
        this.horariosDisponibles = losHorariosDisponibles;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public ArrayList<Horario> getHorariosDisponibles() {
        return horariosDisponibles;
    }
    
    

    
    
    
    
}
