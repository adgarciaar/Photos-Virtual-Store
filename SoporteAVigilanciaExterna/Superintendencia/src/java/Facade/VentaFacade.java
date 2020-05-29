/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.Venta;
import Integracion.ServicioConsultarVenta_Service;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Administrador
 */
@Stateless
public class VentaFacade extends AbstractFacade<Venta> {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/10.39.1.128_8080/NegocioConsultarVentas/ServicioConsultarVenta.wsdl")
    private ServicioConsultarVenta_Service service;

    @PersistenceContext(unitName = "SuperintendenciaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaFacade() {
        super(Venta.class);
    }
    
    public void consultarVentas(){
        
        List<Integracion.Venta> ventas = this.findAll_WS();
        for(int i=0; i<ventas.size(); i++){
            
            //Integracion.Venta venta = new Integracion.Venta();
            Integracion.Venta venta = ventas.get(i);
            
            Entities.Venta nuevaVenta = new Entities.Venta();            
            nuevaVenta.setFecha(venta.getFecha());
            nuevaVenta.setIdfoto(venta.getIdfoto());
            nuevaVenta.setIdventa(venta.getIdventa());
            nuevaVenta.setValor(venta.getValor());
            this.create(nuevaVenta);
            System.out.println(nuevaVenta.toString());
        }
        
        /*Entities.Venta nuevaVenta = new Entities.Venta();
            
            nuevaVenta.setFecha("14/08/20");
            nuevaVenta.setIdfoto(4);
            nuevaVenta.setIdventa(new Long(4));
            nuevaVenta.setValor(65);
            this.create(nuevaVenta);
            System.out.println(nuevaVenta.toString());
        */
        
    }

    private List<Integracion.Venta> findAll_WS() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Integracion.ServicioConsultarVenta port = service.getServicioConsultarVentaPort();
        return port.findAll();
    }

    /*public void persist(Object object) {
        em.persist(object);
    }*/
    
}
