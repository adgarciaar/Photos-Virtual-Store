/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import entities.Carts;
import entities.Comprador;
import entities.Venta;
import facades.FacadeIF;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


/**
 *
 * @author Administrador
 */
@WebService(serviceName = "ServicioIF")
public class ServicioIF {

    @EJB
    private FacadeIF ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Carts entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Carts entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Carts entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Carts find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Carts> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Carts> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
    @WebMethod(operationName = "consultarSaldo")
    public boolean consultarSaldo(Comprador comprador, Venta venta) {
        Carts prueba =  ejbRef.consultarSaldo(comprador.getNumeroTarjeta());
        if(venta.getValor() < prueba.getBalance()){
            return true;
        }
        else{
            return false;
        }
    }
    
}
