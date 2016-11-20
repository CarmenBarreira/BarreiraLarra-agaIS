package barreiralarrañaga.Dominio;

import java.io.Serializable;

public class Restaurante implements Comparable<Restaurante>, Serializable{

    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private String tiposComida;
    private String horarios;
 
    //constructores
    public Restaurante() {
        this.nombre = "Sin nombre";
        this.direccion = "Sin direccion";
        this.tiposComida = "Sin tipo comida";    
        this.horarios = "Sin horario";
    }

    public Restaurante(String elNombre, String laDireccion, String losTiposComida, String losHorarios) {
        this.nombre = elNombre;
        this.direccion = laDireccion;
        this.tiposComida = losTiposComida;
        this.horarios = losHorarios;
    }
    
    //get's y set's
    public void setNombre(String elNombre) {
        this.nombre = elNombre;
    }

    public void setDireccion(String laDireccion) {
        this.direccion = laDireccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getHorarios() {
        return this.horarios;
    }

    public void setTiposComida(String losTiposComida) {
        this.tiposComida = losTiposComida;
    }

    public void setHorarios(String losHorarios) {
        this.horarios = losHorarios;
    }

    
    @Override
    public int compareTo(Restaurante o) {
        return this.getNombre().compareTo(o.getNombre());
    }
    
}
