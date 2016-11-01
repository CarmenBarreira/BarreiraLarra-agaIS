package barreiralarrañaga.Dominio;

public class Cliente {

    //atributos
    private String alias;
    private String nombre;
    private int edad;


    //Constructores
    public Cliente() {
        this.alias = " ";
        this.nombre = " ";
        this.edad = -1;
       
    }

    public Cliente(String alias) {
        this.alias = alias;
        this.nombre = "Sin nombre ";
        this.edad = -1;
        
    }
    
    public Cliente(String elAlias, String elNombre, int laEdad) {
        this.alias = elAlias;
        this.nombre = elNombre;
        this.edad = laEdad;
    }

    // get's y set's    
    public String getAlias() {
        return this.alias;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setAlias(String elAlias) {
        this.alias = elAlias;
    }

    public void setNombre(String elNombre) {
        this.nombre = elNombre;
    }

    public void setEdad(int laEdad) {
        this.edad = laEdad;
    }

}
