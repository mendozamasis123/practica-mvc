/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DAOAutor {
    public Autor Insertar(String cedula, String nombres, String apellidos,
                      String email, java.sql.Date fechaNac) {
    String transaccion = "INSERT INTO Autor (cedula, nombres, apellidos, email, fechaNac) VALUES ('"
                         + nombres + "', '"
                         + apellidos + "', '"
                         + email + "', '"
                         + cedula + "', '"
                         + fechaNac + "')";
    
    
    if (new DataBase().Actualizar( transaccion) > 0) {
        return new Autor(cedula, nombres, apellidos, email, fechaNac );
    }
    return null;
}
public int Actualizar(int id_autor, String nombres, String apellidos,
                      String email, String cedula, java.sql.Date fechaNac) {
    String transaccion = "UPDATE Autor SET nombres='"
                         + nombres + "', apellidos='"
                         + apellidos + "', email='"
                         + email + "', fechaNac='"
                         + fechaNac + "', cedula='"
                         + cedula + "' WHERE id_autor="
                         + id_autor;
    
    return new DataBase().Actualizar(transaccion);
}
public List ObtenerDatos() {
    String transaccion = "SELECT * FROM Autor";
    // Llama a método Listar de DataBase.java
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Autor> autores = new ArrayList<>(); // Arreglo de Autores
    
    // Ciclo que recorre cada registro y los agrega al arreglo autores
    for (Map registro : registros) {
        Autor aut = new Autor((int) registro.get("id_autor"),
                              (String) registro.get("nombres"),
                              (String) registro.get("apellidos"),
                              (String) registro.get("email"),
                              (String) registro.get("cedula"),
                              (java.sql.Date) registro.get("fechaNac"));
        autores.add(aut);
    }
    
    return autores; // Retorna todos los autores ubicados en la tabla de BD
}
    public int Eliminar(int id) {
    String transaccion = "DELETE FROM Autor WHERE id_autor='" + id + "'";
    return new DataBase().Actualizar(transaccion);
}
}
