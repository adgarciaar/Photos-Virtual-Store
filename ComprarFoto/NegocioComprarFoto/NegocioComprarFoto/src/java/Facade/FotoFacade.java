/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.Compra;
import Entities.Foto;
import Integrador.Comprador;
import Integrador.NewWebService_Service;
import java.util.StringTokenizer;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Administrador
 */
@Stateless
public class FotoFacade extends AbstractFacade<Foto> {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/10.39.1.99_8080/NegocioIF/NewWebService.wsdl")
    private NewWebService_Service service;
    @EJB
    VentaFacade ventaFacade= new VentaFacade();

    @PersistenceContext(unitName = "NegocioComprarFotoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FotoFacade() {
        super(Foto.class);
    }
    
    public void calcularValorFoto(Compra fotos)
    {
        System.out.print("llegue a la funcion calcular");
        String todosLosIds=fotos.getIdFotos();
        StringTokenizer st= new StringTokenizer(todosLosIds, ",");
        while (st.hasMoreTokens())
        {
            Long id= Long.parseLong(st.nextToken().trim());
            Foto foto= this.find((Object)id);
            if(enviarAIF(foto.getIdfoto(), foto.getPrecio(), fotos.getNumeroTarjeta()))
            {
                System.out.println("foto enviada a sistemas externos");
                //TODO publicar información de ventas en el topico
            }
        }
       
        
    }
        
    public boolean enviarAIF(long idFoto, int valorTotal, long numeroTarjeta)
    {
        Integrador.Venta ventaIF= new Integrador.Venta();
        ventaIF.setIdfoto(idFoto);
        ventaIF.setValor(valorTotal);
        Integrador.Comprador comprador= new Comprador();
        comprador.setNumeroTarjeta(numeroTarjeta);
        return consultarSaldo(comprador, ventaIF);
    }

    private boolean consultarSaldo(Integrador.Comprador arg0, Integrador.Venta arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Integrador.NewWebService port = service.getNewWebServicePort();
        return port.consultarSaldo(arg0, arg1);
    }
    
}
