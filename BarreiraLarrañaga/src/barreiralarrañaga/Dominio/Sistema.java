package barreiralarrañaga.Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

public class Sistema extends Observable implements Serializable{
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Restaurante> listaRestaurantes;
    
    public Sistema() {
        listaClientes = new ArrayList<Cliente>();
        listaRestaurantes = new ArrayList<Restaurante>();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> laListaClientes) {
        this.listaClientes = laListaClientes;
    }

    public ArrayList<Restaurante> getListaRestaurantes() {
        return listaRestaurantes;
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

    public void modificaCliente(int posicion, String correo, String nombre) {
        /*Modifica de la lista de clientes, el cliente cuya posición en la lista 
        se pasa por parámetros */

        Cliente miCliente = getListaClientes().get(posicion);
       
        if (!(nombre.equalsIgnoreCase(""))) {
            miCliente.setNombre(nombre);
        }
        
        updateObserver();
    }

    public void agregarRestaurante(Restaurante miRestaurante) {
        /*agrega el restaurante en la lista de restaurantes */
        listaRestaurantes.add(miRestaurante);
        updateObserver();
    }

    public ArrayList<Restaurante> ordenarCrecienteRestaurantes (){
    /*Ordena los restaurantes por nombre en orden alfabetico creciente*/
        Collections.sort(this.getListaRestaurantes());
        return this.getListaRestaurantes();
    }


}
