//---Paquete---//.
package com.clases_auxiliares;

//---Sentencias import---//.
import javax.swing.ImageIcon;

//---Clase pública---//.
public class Imagen {

    //---Atributos---//.
    private String descripcion;
    private ImageIcon imagen;
    
    //---Constructor---//.
    public Imagen() {
        this.descripcion = "";
        this.imagen = new ImageIcon();
    }
    
    //---Constructor con argumentos---//.
    public Imagen(String descripcion, ImageIcon imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
    
    //---Getters---//.
    public String getDescripcion() {return descripcion;}
    public ImageIcon getImagen() {return imagen;}
    
    //---Setters---//.
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setImagen(ImageIcon imagen) {this.imagen = imagen;}
     
}