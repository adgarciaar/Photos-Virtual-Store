/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.Correo;
import Entities.Foto;
import Integracion.WSDerechosAutor;
//import Integracion.WSDerechosAutor;
//import Integracion.WSDerechosAutor;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Administrador
 */
@Stateless
public class FotoFacade extends AbstractFacade<Foto> {    

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_63413/WSDerechosAutor.svc.singlewsdl.wsdl")
    private WSDerechosAutor service;

    @Resource(mappedName = "jms/queueCorreos")
    private Queue queueCorreos;

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;

    @PersistenceContext(unitName = "NegocioAgregarFotoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FotoFacade() {
        super(Foto.class);
    }
    
    public void agregarFoto(Foto foto){
        //System.out.println("Entro a la funcion con id "+foto.getIdfoto().intValue());
        
        //validación con SistemaDerechosAutor en .NET        
        if ( this.consultarFotoHabilitada(foto.getIdfoto().intValue()) ){            
            
            this.create(foto); 
            
            Correo nuevoCorreo = new Correo();
            nuevoCorreo.setAsunto("Foto agregada");
            nuevoCorreo.setDirigido(foto.getCorreo());
            nuevoCorreo.setRemitente("corrreo@javeriana.edu.co");
            nuevoCorreo.setMensaje("La foto con id "+foto.getIdfoto()+" fue agregada con éxito");
            
            this.sendJMSMessageToQueueCorreos(nuevoCorreo);
        }else{
            System.out.println("Foto con id "+foto.getIdfoto()+" no habilitada en SistemaDerechosAutor");
        }
        
    }

    private void sendJMSMessageToQueueCorreos(Correo correo) {
        context.createProducer().send(queueCorreos, correo);
    }

    private Boolean consultarFotoHabilitada(java.lang.Integer id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Integracion.IWSDerechosAutor port = service.getBasicHttpBindingIWSDerechosAutor();
        return port.consultarFotoHabilitada(id);
    }
    
}
