package barreiralarrañaga.Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Sorteo implements Serializable {

    //Atributos
    private ArrayList<Cliente> ganadores;
    private String premio;
    private int cantidadPremios;
    private ArrayList<Cliente> participantes;
    private String nombre;
    private int cantidadParticipantes;
    private Date fecha;

    //Constructores
    public Sorteo() {
        nombre = "";
        ganadores = new ArrayList<Cliente>();
        premio = "Premio sin definir.";
        cantidadPremios = 0;
        cantidadParticipantes = 0;
        participantes = new ArrayList<Cliente>();
    }

    public Sorteo(String nombreSorteo, String premioParam, int cantidadPremiosParam) {
        cantidadPremios = cantidadPremiosParam;
        premio = premioParam;
        nombre = nombreSorteo;
    }

    //get´s y set´s
    public String getPremio() {
        return this.premio;
    }

    public void setPremio(String elPremio) {
        this.premio = elPremio;
    }

    public int getCantidadPremios() {
        return this.cantidadPremios;
    }

    public void setCantidadPremios(int laCantidadPremios) {
        this.cantidadPremios = laCantidadPremios;
    }

    public ArrayList<Cliente> getParticipantes() {
        return this.participantes;
    }

    public void setParticipantes(ArrayList<Cliente> losParticipantes) {
        this.participantes = losParticipantes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String elNombre) {
        this.nombre = elNombre;
    }

    public ArrayList<Cliente> getGanadores() {
        return this.ganadores;
    }

    public void setGanadores(ArrayList<Cliente> losGanadores) {
        this.ganadores = losGanadores;
    }

    public int getCantidadParticipantes() {
        return this.cantidadParticipantes;
    }

    public void setCantidadParticipantes(int laCantidadParticipantes) {
        this.cantidadParticipantes = laCantidadParticipantes;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date laFecha) {
        this.fecha = laFecha;
    }

}
