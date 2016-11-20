package barreiralarrañaga.Dominio;

import java.io.Serializable;

public class Horario implements Serializable{
    private String dia; 
    private String horaInicio; 
    private String horaFin;  

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

    public String getDia() {
        return dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
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
