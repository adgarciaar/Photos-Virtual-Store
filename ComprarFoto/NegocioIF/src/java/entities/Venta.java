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
public class Venta {
    
    long idventa;
    long idfoto;
    String fecha;
    int valor;

    public Venta(long idventa, long idfoto, String fecha, int valor) {
        this.idventa = idventa;
        this.idfoto = idfoto;
        this.fecha = fecha;
        this.valor = valor;
    }

    public Venta() {
    }

    public long getIdventa() {
        return idventa;
    }

    public void setIdventa(long idventa) {
        this.idventa = idventa;
    }

    public long getIdfoto() {
        return idfoto;
    }

    public void setIdfoto(long idfoto) {
        this.idfoto = idfoto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
