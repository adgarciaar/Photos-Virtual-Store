/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.Compra;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@Stateless
public class CompraFacade extends AbstractFacade<Compra> {

    @PersistenceContext(unitName = "NegocioComprarFotosPU")
    private EntityManager em;
    
    @EJB
    FotoFacade fotoFacade;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompraFacade() {
        super(Compra.class);
    }
    
    public void comprarFotos(Compra compra){
        
        Long id = Long.parseLong(compra.getIdfotos());
        
        System.out.println("Estuvimos aca: "+fotoFacade.find(id));
        
    }
    
}
