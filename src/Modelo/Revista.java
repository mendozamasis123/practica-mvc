/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Time;


public class Revista {
    int Numero;
    String titulo;
    int ayo;
    String issn;
    float precio;
    Time Horaventa;

    public Revista(String titulo, int ayo, String issn, float precio, Time Horaventa) {
        this.titulo = titulo;
        this.ayo = ayo;
        this.issn = issn;
        this.precio = precio;
        this.Horaventa = Horaventa;
    }

    public Revista(int Numero, String titulo, int ayo, String issn, float precio, Time Horaventa) {
        this.Numero = Numero;
        this.titulo = titulo;
        this.ayo = ayo;
        this.issn = issn;
        this.precio = precio;
        this.Horaventa = Horaventa;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAyo() {
        return ayo;
    }

    public void setAyo(int ayo) {
        this.ayo = ayo;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Time getHoraventa() {
        return Horaventa;
    }

    public void setHoraventa(Time Horaventa) {
        this.Horaventa = Horaventa;
    }
    
}
