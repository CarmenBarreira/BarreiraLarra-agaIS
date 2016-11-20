package barreiralarrañaga.Dominio;

import java.io.Serializable;

public class Horario implements Serializable{
    
    //Atributos
    private String dia; 
    private String horaInicio; 
    private String horaFin;  

    //Constructores
    public Horario() {
        this.dia = "";
        this.horaInicio = "";
        this.horaFin = "";    
    }  
    
    
    public Horario(String elDia, String laHoraInicio, String laHoraFin) {
        this.dia = elDia;
        this.horaInicio = laHoraInicio;
        this.horaFin = laHoraFin;
    }

    //get's y set's
    public String getDia() {
        return this.dia;
    }

    public String getHoraInicio() {
        return this.horaInicio;
    }

    public String getHoraFin() {
        return this.horaFin;
    }

    public void setDia(String elDia) {
        this.dia = elDia;
    }

    public void setHoraInicio(String laHoraInicio) {
        this.horaInicio = laHoraInicio;
    }

    public void setHoraFin(String laHoraFin) {
        this.horaFin = laHoraFin;
    }   
    
    
}
