package barreiralarrañaga.Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public class Sistema extends Observable implements Serializable {

    private Restaurante restaurante;
    private ArrayList<Evaluacion> evaluaciones;
    private ArrayList<Sorteo> sorteos;
  
    public Sistema() {
        restaurante = new Restaurante();
        evaluaciones = new ArrayList<Evaluacion>();
    }

    public Restaurante getRestaurante() {
        return this.restaurante;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return this.evaluaciones;
    }

    public void setRestaurante(Restaurante miRestaurante) {
        this.restaurante = miRestaurante;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> lasEvaluaciones) {
        this.evaluaciones = lasEvaluaciones;
    }

    public void updateObserver() {
        setChanged();
        notifyObservers();
    }

    public void agregarEditarRestaurante(Restaurante miRestaurante) {
        this.setRestaurante(miRestaurante);
        updateObserver();
    }

    public ArrayList<Cliente> getParticipantesSorteo() {
        ArrayList<Cliente> participantes = new ArrayList<>();
        for (int i = 0; i < this.getEvaluaciones().size(); i++) {
            Evaluacion aux = getEvaluaciones().get(i);
            if (!aux.getResenia().isEmpty() && !aux.getCliente().getNombreCliente().isEmpty()) {
                participantes.add(aux.getCliente());
            }

        }
        return participantes;
    }

    public ArrayList<Sorteo> getSorteos() {
        return sorteos;
    }

    public void setSorteos(ArrayList<Sorteo> losSorteos) {
        this.sorteos = losSorteos;
        
    }

    public Sorteo getSorteoActual() {
        return sorteos.get(0);
    }

    public void setSorteoActual(Sorteo elSorteoActual) {
        this.sorteos.add(0, elSorteoActual);
    }

}
