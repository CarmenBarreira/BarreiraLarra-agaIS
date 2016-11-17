package barreiralarrañaga.Dominio;

import java.util.ArrayList;

public class Restaurante implements Comparable<Restaurante>{

    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private ArrayList<String> tiposComida;
 

    public Restaurante() {
        this.nombre = "Sin nombre";
        this.direccion = "Sin direccion";
        this.tiposComida = new ArrayList<String>();       
    }

    public Restaurante(String nombre, String direccion, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tiposComida = new ArrayList<String>();
    }
    
    public void setNombre(String elNombre) {
        this.nombre = elNombre;
    }

    public void setDireccion(String laDireccion) {
        this.direccion = laDireccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public int compareTo(Restaurante o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    

    
    
    
    
}
