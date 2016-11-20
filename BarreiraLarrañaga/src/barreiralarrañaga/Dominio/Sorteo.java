package barreiralarrañaga.Dominio;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorteo {

    private ArrayList<Cliente> ganadores;
    private String premio;
    private int cantidadPremios;
    private ArrayList<Cliente> participantes;
    private String nombre;
    private int cantidadParticipantes;

    public Sorteo() {
        nombre = "";
        ganadores = new ArrayList<>();
        premio = "Premio sin definir.";
        cantidadPremios = 0;
        cantidadParticipantes = 0;
    }

    public Sorteo(String nombreSorteo, String premioParam, int cantidadPremiosParam) {
        cantidadPremios = cantidadPremiosParam;
        premio = premioParam;
        nombre = nombreSorteo;

    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String elPremio) {
        this.premio = elPremio;
    }

    public int getCantidadPremios() {
        return cantidadPremios;
    }

    public void setCantidadPremios(int laCantidadPremios) {
        this.cantidadPremios = laCantidadPremios;
    }

    public ArrayList<Cliente> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Cliente> losParticipantes) {
        this.participantes = losParticipantes;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ganadores
     */
    public ArrayList<Cliente> getGanadores() {
        return ganadores;
    }

    /**
     * @param ganadores the ganadores to set
     */
    public void setGanadores(ArrayList<Cliente> ganadores) {
        this.ganadores = ganadores;
    }

    /**
     * @return the cantidadParticipantes
     */
    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    /**
     * @param cantidadParticipantes the cantidadParticipantes to set
     */
    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

}
