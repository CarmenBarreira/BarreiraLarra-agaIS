package barreiralarrañaga.Dominio;

import java.util.ArrayList;

public class Cliente {

    //atributos
    private String correo;
    private String nombre;
    private ArrayList<String> reseña ; 


    //Constructores
    public Cliente() {
        this.correo = " ";
        this.nombre = " "; 
    }

    public Cliente(String miCorreo) {
        this.correo = miCorreo;
        this.nombre = "Sin nombre ";
    }
    
    // get's y set's    
    public String getCorreo() {
        return this.correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String elNombre) {
        this.nombre = elNombre;
    }

}
