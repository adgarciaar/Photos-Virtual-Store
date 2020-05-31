/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.*;
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
        
        FechaVenta fecha = new FechaVenta();
        System.out.println("Fecha a consultar: "+fecha.getFechaConsulta());
        
        Integracion.FechaVenta fechaConsulta = new Integracion.FechaVenta();
        fechaConsulta.setFechaConsulta(fecha.getFechaConsulta());
        
        List<Integracion.Venta> ventas = this.findAll(fechaConsulta);
        for(int i=0; i<ventas.size(); i++){
            
            Integracion.Venta venta = ventas.get(i); 
            
            if (this.find(venta.getIdventa()) == null ){
            //if (this.find(new Long(4)) == null ){
                Entities.Venta nuevaVenta = new Entities.Venta(); 
                nuevaVenta.setFecha(venta.getFecha());
                nuevaVenta.setIdfoto(venta.getIdfoto());
                nuevaVenta.setIdventa(venta.getIdventa());
                nuevaVenta.setValor(venta.getValor());

                this.create(nuevaVenta);
                System.out.println("Creada la venta "+nuevaVenta.toString());
                //System.out.println("No existe");
            }else{
               //System.out.println("Ya existe");
               System.out.println("Ya existe venta con id: "+venta.getIdventa());
            }
            
        }
        
    }

    private java.util.List<Integracion.Venta> findAll(Integracion.FechaVenta arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Integracion.ServicioConsultarVenta port = service.getServicioConsultarVentaPort();
        return port.findAll(arg0);
    }
    
}
