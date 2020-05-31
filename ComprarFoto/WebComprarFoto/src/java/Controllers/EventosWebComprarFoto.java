/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Compra;
import Integracion.ProxyWebComprarFotos;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Administrador
 */
@Named(value = "eventosWebComprarFoto")
@SessionScoped
public class EventosWebComprarFoto implements Serializable {
    
    private Compra compra = new Compra();

    /**
     * Creates a new instance of EventosComprarFoto
     */
    public EventosWebComprarFoto() {
    }

    public Compra getCompra() {
        return this.compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
    public String comprarFotos(){
        ProxyWebComprarFotos proxy = new ProxyWebComprarFotos();
        proxy.create_XML(this.compra);
        //System.out.println("Enviada peticion");
        //System.out.println(this.compra);
        return "confirmacion";
    }
    
}
