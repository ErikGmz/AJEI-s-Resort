//---Paquete---//.
package com.clases_auxiliares;

//---Clase pública---//.
public class Habitacion {

    //---Atributos---//.
    private String idHabitacion;
    private String tipoHabitacion;
    private Imagen imagenHabitacion;

    //---Constructor---//.
    public Habitacion() {
        this.idHabitacion = "";
        this.tipoHabitacion = "";
        this.imagenHabitacion = null;
    }

    //---Constructor con argumentos---//.
    public Habitacion(String idHabitacion, String tipoHabitacion, Imagen imagenHabitacion) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.imagenHabitacion = imagenHabitacion;
    }

    //---Getters---//.
    public String getIdHabitacion() {
        return idHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public Imagen getImagenHabitacion() {
        return imagenHabitacion;
    }

    //---Setters---//.
    public void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setImagenHabitacion(Imagen imagenHabitacion) {
        this.imagenHabitacion = imagenHabitacion;
    }
}
