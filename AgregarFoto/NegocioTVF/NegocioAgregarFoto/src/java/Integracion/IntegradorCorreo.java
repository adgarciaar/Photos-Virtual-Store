/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion;

import Entities.Correo;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Administrador
 */
@Stateless
@LocalBean
public class IntegradorCorreo {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    private static final String SERVIDOR_SMTP = "smtp.office365.com";
    private static final int PORT_SERVIDOR_SMTP = 587;
    //private static final String CONTA_PADRAO = "diego.mateus@javeriana.edu.co";
    private static final String password = "mateuscruz1994";

    //private final String from = "diego.mateus@javeriana.edu.co";
    //private final String to = "adriangarcia@javeriana.edu.co";

    //private final String subject = "Prueba desde Java 2";
    //private final String messageContent = "Mi primer correo desde Java 2";

    public void sendEmail(Correo correo) {
        final Session session = Session.getInstance(this.getEmailProperties(), new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(correo.getRemitente(), password);
            }

        });

        try {
            final Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(correo.getDirigido()));
            message.setFrom(new InternetAddress(correo.getRemitente()));
            message.setSubject(correo.getAsunto());
            message.setText(correo.getMensaje());
            message.setSentDate(new Date());
            Transport.send(message);
        } catch (final MessagingException ex) {
            LOGGER.log(Level.WARNING, "Error al enviar mensaje: " + ex.getMessage(), ex);
        }
    }

    public Properties getEmailProperties() {
        final Properties config = new Properties();
        config.put("mail.smtp.auth", "true");
        config.put("mail.smtp.starttls.enable", "true");
        config.put("mail.smtp.host", SERVIDOR_SMTP);
        config.put("mail.smtp.port", PORT_SERVIDOR_SMTP);
        return config;
    }
    
    public void enviarCorreo(Correo correo){
        this.sendEmail(correo);
    }
    
}
