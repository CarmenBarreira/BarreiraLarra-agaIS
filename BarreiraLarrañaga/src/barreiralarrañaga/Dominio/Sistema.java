package barreiralarrañaga.Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public class Sistema extends Observable implements Serializable{
   Restaurante restaurante; 
    ArrayList<Evaluacion> evaluaciones;

    public Sistema() {
        restaurante = new Restaurante();
        evaluaciones= new ArrayList<Evaluacion>();
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
    
    public ArrayList<Evaluacion> evaluacionesSorteo (){        
        /*Esta funcion va retornar las evaluaciones que estan completas*/
        return new ArrayList<Evaluacion>();
    }
    
}
