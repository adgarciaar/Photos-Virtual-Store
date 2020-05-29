/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.Correo;
import Entities.Foto;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@Stateless
public class FotoFacade extends AbstractFacade<Foto> {

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
    
    /*public void publicarEnCola(Foto foto){
        this.sendJMSMessageToQueueCorreos(foto);
    }*/
    
    public void agregarFoto(Foto foto){
        //if la validación de Nicolás
        this.create(foto);
        
        Correo nuevoCorreo = new Correo();
        nuevoCorreo.setAsunto("Foto agregada");
        nuevoCorreo.setDirigido(foto.getCorreo());
        nuevoCorreo.setRemitente("diego.mateus@javeriana.edu.co");
        nuevoCorreo.setMensaje("La foto con id "+foto.getIdfoto()+" fue agregada con éxito");
        
        this.sendJMSMessageToQueueCorreos(nuevoCorreo);
    }

    private void sendJMSMessageToQueueCorreos(Correo correo) {
        context.createProducer().send(queueCorreos, correo);
    }
    
}
