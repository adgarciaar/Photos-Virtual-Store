/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entities.Compra;
import Facade.FotoFacade;
import Facade.VentaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Administrador
 */
@Stateless
@Path("entities.compra")
public class CompraFacadeREST extends AbstractFacade<Compra> {


    private EntityManager em=null;
    @EJB
    VentaFacade ventaFacade=new VentaFacade();
    
    @EJB
    FotoFacade fotoFacade=new FotoFacade();
    public CompraFacadeREST() {
        super(Compra.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Compra entity) {
        fotoFacade.calcularValorFoto(entity);
    }

    @Override
    protected EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

 
}
