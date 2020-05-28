/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Foto;
import Integracion.ProxyWebAgregarFoto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
@Named(value = "eventosWebAgregarFoto")
@SessionScoped
public class EventosWebAgregarFoto implements Serializable {

    private Foto foto = new Foto();

    /**
     * Creates a new instance of EventosWebAgregarFoto
     */
    public EventosWebAgregarFoto() {
    }
    
    public String agregarFoto(){        
        ProxyWebAgregarFoto proxy = new ProxyWebAgregarFoto();
        proxy.create_XML(this.foto);
        return "confirmacion";
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }
    
    public List<Foto> getFotico(){
        List<Foto> listaFotos = new ArrayList<>();
        listaFotos.add(foto);
        return listaFotos;
    }
    
}
