package barreiralarrañaga.Dominio;


import java.util.ArrayList;
import java.util.Arrays;

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

    public Cliente[] getGanadores() {
        return ganadores;
    }

    
    public void setGanadores(Cliente[] losGanadores) {
        this.ganadores = losGanadores;
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

}
