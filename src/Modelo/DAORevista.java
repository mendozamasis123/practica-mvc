/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DAORevista {
    public Revista Insertar(String titulo, int ayo, String issn,
                      float precio, java.sql.Time Horaventa) {
    String transaccion = "INSERT INTO Revista (titulo, ayo, issn, precio, Horaventa) VALUES ('"
                         + titulo + "', '"
                         + ayo + "', '"
                         + issn + "', '"
                         + precio + "', '"
                         + Horaventa + "')";
    
    
    if (new DataBase().Actualizar( transaccion) > 0) {
        return new Revista(titulo, ayo, issn, precio, Horaventa );
    }
    return null;
}
     public int Actualizar(int numero, String titulo, int ayo,
                      String issn, float precio, java.sql.Time Horaventa) {
    String transaccion = "UPDATE Revista SET titulo='"
                         + titulo + "', ayo='"
                         + ayo + "', issn='"
                         + issn + "', precio='"
                         + precio + "', Horaventa='"
                         + Horaventa + "' WHERE numero="
                         + numero;
    
    return new DataBase().Actualizar(transaccion);
}
     public List ObtenerDatos() {
    String transaccion = "SELECT * FROM Revista";
    // Llama a método Listar de DataBase.java
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Revista> Revistas = new ArrayList<>(); // Arreglo de Revistas
    
    // Ciclo que recorre cada registro y los agrega al arreglo Revistas
    for (Map registro : registros) {
        Revista rev = new Revista((int) registro.get("Numero"),
                              (String) registro.get("titulo"),
                              (int) registro.get("ayo"),
                              (String) registro.get("issn"),
                              (float) registro.get("precio"),
                              (java.sql.Time) registro.get("Horaventa"));
        Revistas.add(rev);
    }
    
    return Revistas; // Retorna todas las Revistas ubicadas en la tabla de BD
}
     public int Eliminar(int numero) {
    String transaccion = "DELETE FROM Revista WHERE numero='" + numero + "'";
    return new DataBase().Actualizar(transaccion);
}
}
