/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Administrador
 */
public class Comprador {
    
    String nombre;
    long numeroTarjeta;

    public Comprador(String nombre, long numeroTarjeta) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
    }

    public Comprador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
}
