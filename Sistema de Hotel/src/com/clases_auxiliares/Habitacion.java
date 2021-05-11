//---Paquete---//.
package com.clases_auxiliares;

//---Clase pública---//.
public class Habitacion {

    //---Atributos---//.
    private String idHabitacion;
    private String tipoHabitacion;
    
    //---Constructor---//.
    public Habitacion() {
        this.idHabitacion = "";
        this.tipoHabitacion = "";
    }
    
    //---Constructor con argumentos---//.
    public Habitacion(String idHabitacion, String tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }
    
    //---Getters---//.
    public String getIdHabitacion() {return idHabitacion;}
    public String getTipoHabitacion() {return tipoHabitacion;}
    
    //---Setters---//.
    public void setIdHabitacion(String idHabitacion) {this.idHabitacion = idHabitacion;}
    public void setTipoHabitacion(String tipoHabitacion) {this.tipoHabitacion = tipoHabitacion;}
       
}