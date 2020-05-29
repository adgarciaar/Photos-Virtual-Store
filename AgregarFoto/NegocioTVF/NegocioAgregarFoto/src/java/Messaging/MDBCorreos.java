/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messaging;

import Entities.Correo;
import Entities.Foto;
import Integracion.IntegradorCorreo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author Administrador
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/queueCorreos")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MDBCorreos implements MessageListener {
    
    @EJB
    IntegradorCorreo integradorCorreo;
    
    public MDBCorreos() {
    }
    
    @Override
    public void onMessage(Message message) {
        
        try {
            integradorCorreo.enviarCorreo(message.getBody(Correo.class));
            System.out.println("Mensaje recibido: " + message.getBody(Correo.class));
        } catch (JMSException ex) {
            Logger.getLogger(MDBCorreos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
