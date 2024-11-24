/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.*;


public class DataBase {
     private final String URI = "jdbc:mysql://localhost:3306/publicacion2";
    private final String user = "root";
    private final String password = "123456789";

    private Connection conexion;
    
   public DataBase() {
    try {
        conexion = DriverManager.getConnection(URI, user, password);
        System.out.println("Conexión Establecida");
    } catch (SQLException e) {
        System.out.println("Error de conexión");
        e.printStackTrace();
    }
}
   public int Actualizar(String consulta) {
    try {
        Statement st = conexion.createStatement();
        return st.executeUpdate(consulta);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}
   private List OrganizarDatos(ResultSet rs) {
    List filas = new ArrayList(); // Arreglo de elementos
    try {
        int numColumnas = rs.getMetaData().getColumnCount();
        while (rs.next()) { // Recorre cada registro de la tabla
            Map<String, Object> renglon = new HashMap();
            for (int i = 1; i <= numColumnas; i++) {
                String nombreCampo = rs.getMetaData().getColumnName(i);
                Object valor = rs.getObject(nombreCampo);
                // Por cada campo, se obtiene el nombre y el valor del mismo
                renglon.put(nombreCampo, valor);
            }
            filas.add(renglon); // Se agrega al arreglo cada registro
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return filas;
}
   public List Listar(String consulta) {
    ResultSet rs = null;
    List resultado = new ArrayList();
    try {
        Statement st = conexion.createStatement();
        rs = st.executeQuery(consulta);
        resultado = OrganizarDatos(rs);
    } catch (SQLException e) {
        System.out.println("No se realizó la consulta");
        e.printStackTrace();
    }
    return resultado;
}
   public void cerrarConexion() {
    try {
        conexion.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
