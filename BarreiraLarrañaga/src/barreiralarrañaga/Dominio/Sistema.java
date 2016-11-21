package barreiralarrañaga.Dominio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public class Sistema extends Observable implements Serializable {

    //Atributos
    private Restaurante restaurante;
    private ArrayList<Evaluacion> evaluaciones;
    private ArrayList<Sorteo> sorteos;
    private Sorteo sorteoActual;

    //Constructor
    public Sistema() {
        restaurante = new Restaurante();
        evaluaciones = new ArrayList<Evaluacion>();
        sorteoActual = null;
        sorteos = new ArrayList<>();
    }

    //get's y set's
    
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
    
    public void setSorteos(ArrayList<Sorteo> losSorteos) {
        this.sorteos = losSorteos;
    }
    
    public ArrayList<Sorteo> getSorteos() {
        return this.sorteos;
    }
    
    public Sorteo getSorteoActual() {
        return this.sorteoActual;
    }

    public void setSorteoActual(Sorteo elSorteoActual) {
        this.sorteoActual = elSorteoActual;
    }
    
    public void persistirGuardar(Sistema sis) throws IOException {
        //Esta funcion persiste los datos
        FileOutputStream f = new FileOutputStream("archivo");
        BufferedOutputStream b = new BufferedOutputStream(f);
        ObjectOutputStream s = new ObjectOutputStream(b);
        try {
            s.writeObject(sis);
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("1G-" + e.getMessage());
        } 
    }

    public Sistema persistirLeer() throws IOException, ClassNotFoundException {
        //Carga los datos al sistema
        FileInputStream ff = new FileInputStream("archivo");
        BufferedInputStream bb = new BufferedInputStream(ff);
        ObjectInputStream ss = new ObjectInputStream(bb);
        Sistema sisRetorno = new Sistema();
        try {
            sisRetorno = (Sistema) ss.readObject();
            ss.close();
        } catch (FileNotFoundException e) {
            System.out.println("1L-" + e.getMessage());
        } 
        return sisRetorno;
    }

    public ArrayList<Cliente> sortear() {
        /*Esta funcion realiza el sorte, y devuelve una lista con los ganadores 
        del mismo.*/
        ArrayList<Cliente> ganadoresDeSorteo = new ArrayList<Cliente>();
        int contador = 0;

        while (contador < sorteoActual.getCantidadPremios() && contador <= sorteoActual.getParticipantes().size()) {
            int number = (int) (Math.random() * sorteoActual.getParticipantes().size());

            //Chequeo que el ganador no este mas de una vez en la lista.
            if (!ganadoresDeSorteo.contains(sorteoActual.getParticipantes().get(number))) {
                ganadoresDeSorteo.add(sorteoActual.getParticipantes().get(number));
                sorteoActual.getParticipantes().remove(number);
                contador++;
            } else {
                sorteoActual.getParticipantes().remove(number);
            }
        }
        return ganadoresDeSorteo;
    }

    public double getPromedioEval() {
        //Retorna el promedio de evaluaciones del restaurante
        int cantidadEval = evaluaciones.size();
        double prom = 0;
        if (cantidadEval > 0) {
            for (int i = 0; i < cantidadEval; i++) {
                prom = prom + evaluaciones.get(i).getEstrellas();
            }
            prom = prom / cantidadEval;
        }
        return prom;
    }

    public void updateObserver() {
        setChanged();
        notifyObservers();
    }

    public void agregarEditarRestaurante(Restaurante miRestaurante) {
        /*Recibe un Restaurante por parametro y actualiza en el sistema por el mismo*/
        this.setRestaurante(miRestaurante);
        updateObserver();
    }

    public ArrayList<Cliente> getParticipantesSorteo() {
        /*Retorna la lista de participantes del mismo*/
        ArrayList<Cliente> participantes = new ArrayList<>();
        for (int i = 0; i < this.getEvaluaciones().size(); i++) {
            Evaluacion aux = getEvaluaciones().get(i);
            if (!aux.getResenia().isEmpty() && !aux.getCliente().getNombreCliente().isEmpty()) {
                participantes.add(aux.getCliente());
            }
        }
        return participantes;
    }  

}
