package barreiralarrañaga.Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public class Sistema extends Observable implements Serializable{
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Horario> horariosDisponibles;
    private ArrayList<TipoComida> tiposComidaDisponibles;
    private ArrayList<Restaurante> listaRestaurantes;
    
    public Sistema() {
        listaClientes = new ArrayList<Cliente>();
        horariosDisponibles = new ArrayList<Horario>();
        tiposComidaDisponibles = new ArrayList<TipoComida>();
        listaRestaurantes = new ArrayList<Restaurante>();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> laListaClientes) {
        this.listaClientes = laListaClientes;
    }
   
    public void agregarCliente(Cliente miCliente) {
        /*agrega el cliente en la lista de clientes */
        listaClientes.add(miCliente);
        updateObserver();
    }
     
    public void updateObserver() {
        setChanged();
        notifyObservers();
    } 
    
    public void eliminarCliente(Cliente c) {
        /*Elimina de la lista de clientes, el cliente*/
        listaClientes.remove(c);
        updateObserver();
    }

    public void modificaCliente(int posicion, String alias, String nombre, int edad) {
        /*Modifica de la lista de clientes, el cliente cuya posición en la lista 
        se pasa por parámetros */

        Cliente miCliente = getListaClientes().get(posicion);
        if (!(alias.equalsIgnoreCase(""))) {
            miCliente.setAlias(alias);
        }
        if (!(nombre.equalsIgnoreCase(""))) {
            miCliente.setNombre(nombre);
        }
        if (edad != 0) {
            miCliente.setEdad(edad);
        }
        updateObserver();
    }
}
