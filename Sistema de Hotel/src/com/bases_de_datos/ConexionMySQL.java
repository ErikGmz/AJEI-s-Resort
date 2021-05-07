//---Paquete---//.
package com.bases_de_datos;

//---Sentencias import---//.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class ConexionMySQL {
    
    //---Atributos---//.
    private String controladora;
    private String urlServidor;
    private String nombreLogin;
    private String codigo;
    private Connection conexion;
    
    //---Constructor predeterminado---//.
    public ConexionMySQL() {
        //-Especificar datos del servidor de la base de datos-//.
        this.controladora = "com.mysql.jdbc.Driver";
        this.urlServidor = "jdbc:mysql://localhost/baseajei";
        this.nombreLogin = "root";
        this.codigo = "";
        
        //-Iniciar la conexión-//.
        this.iniciarConexion();
    }
    
    //---Constructor con argumento---//.
    public ConexionMySQL(String nombreBase) {
        //Especificar datos del servidor de la base de datos.
        this.controladora = "com.mysql.jdbc.Driver";
        this.urlServidor = new String("jdbc:mysql://localhost/" + nombreBase);
        this.nombreLogin = "root";
        this.codigo = "";
        
        //Iniciar la conexión.
        this.iniciarConexion();
    }
    
    //---Métodos---//.
    //-Iniciar la conexión con la base de datos previamente especificada-//.
    private void iniciarConexion() {
        try {
            Class.forName(controladora).newInstance();
            this.conexion = DriverManager.getConnection(this.urlServidor, this.nombreLogin, this.codigo);
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            System.err.println("Error al tratar de abrir la base de datos especificada");
            ex.printStackTrace();
        }
    }
    
    //-Insertar en una tabla específica un conjunto de datos-//.
    public void insertarDatos(String nombreTabla, String parametros, String valores) {
        //Estructura del comando.
        String comando = "INSERT INTO " + nombreTabla + parametros + " VALUES " + valores + ";";
        
        try {
            Statement declaracion = this.conexion.createStatement();
            declaracion.executeUpdate(comando);
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "La inserción no pudo ser "
            + "realizada.\n" + "Verifique la conexión con la base de datos.\n"
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //-Realizar una consulta de cierta información, a partir de una sola tabla-//.
    public ResultSet consultaUnaTabla(String nombreTabla, String campo, String parametros) {
        //Variable para almacenar los resultados de la consulta.
        ResultSet resultados = null;
        
        //Estructura de la consulta.
        String consulta = "SELECT " + campo + " FROM " + nombreTabla + " " + parametros + ";";
        
        try {
            Statement declaracion = this.conexion.createStatement();
            resultados = declaracion.executeQuery(consulta);
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "La consulta no pudo ser "
            + "realizada.\n" + "Verifique la conexión con la base de datos.\n"
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return resultados;
    }
    
    //-Actualizar datos de una tabla-//.
    public void actualizarDatos(String nombreTabla, String campos, String parametros) { 
        //Estructura del comando.
        String comando = "UPDATE " + nombreTabla + " SET " + campos + " " + parametros + ";";
        
        try {
            Statement declaracion = this.conexion.createStatement();
            declaracion.executeUpdate(comando);
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "La actualización no pudo ser "
            + "realizada.\n" + "Verifique la conexión con la base de datos.\n"
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //-Borrar datos de una tabla-//.
    public void borrarDatos(String nombreTabla, String parametros) { 
        //Estructura de la consulta.
        String comando = "DELETE FROM " + nombreTabla + " " + parametros + ";";
        
        try {
            Statement declaracion = this.conexion.createStatement();
            declaracion.executeUpdate(comando);
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "La eliminación no pudo ser "
            + "realizada.\n" + "Verifique la conexión con la base de datos.\n"
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}