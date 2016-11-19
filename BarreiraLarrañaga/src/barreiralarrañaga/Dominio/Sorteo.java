/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barreiralarrañaga.Dominio;


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Juan
 */
public class Sorteo {

    private Cliente[] ganadores;
    private String premio;
    private int cantidadPremios;
    private ArrayList<Cliente> participantes;

    public Sorteo() {
        ganadores = new Cliente[0];
        premio = "Premio sin definir.";
        cantidadPremios = 0;
    }

    public Sorteo(String premioParam, ArrayList<Cliente> participantesParam) {
        ganadores = new Cliente[0];
        participantes = participantesParam;
        cantidadPremios = 0;
        premio = premioParam;

    }
    public Sorteo(String premioParam, int cantidadPremiosParam) {
        cantidadPremios = cantidadPremiosParam;
        premio = premioParam;

    }
    public Cliente[] sortear() {
        Cliente[] ganadoresDeSorteo = new Cliente[getCantidadPremios()];
        int contador = 0;
        while (contador < getCantidadPremios()) {
            int number = (int) (Math.random() * participantes.size());
            //Chequeo que el ganador no este mas de una vez en la lista.
            if (Arrays.asList(ganadoresDeSorteo).contains(participantes.get(number))) {
                ganadoresDeSorteo[contador] = participantes.get(number);
                participantes.remove(number);
                contador++;
            }

        }

        return ganadoresDeSorteo;

    }

    /**
     * @return the ganadores
     */
    public Cliente[] getGanadores() {
        return ganadores;
    }

    /**
     * @param ganadores the ganadores to set
     */
    public void setGanadores(Cliente[] ganadores) {
        this.ganadores = ganadores;
    }

    /**
     * @return the premio
     */
    public String getPremio() {
        return premio;
    }

    /**
     * @param premio the premio to set
     */
    public void setPremio(String premio) {
        this.premio = premio;
    }

    /**
     * @return the cantidadPremios
     */
    public int getCantidadPremios() {
        return cantidadPremios;
    }

    /**
     * @param cantidadPremios the cantidadPremios to set
     */
    public void setCantidadPremios(int cantidadPremios) {
        this.cantidadPremios = cantidadPremios;
    }

    /**
     * @return the participantes
     */
    public ArrayList<Cliente> getParticipantes() {
        return participantes;
    }

    /**
     * @param participantes the participantes to set
     */
    public void setParticipantes(ArrayList<Cliente> participantes) {
        this.participantes = participantes;
    }

}
