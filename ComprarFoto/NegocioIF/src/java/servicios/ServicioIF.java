/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entities.Comprador;
import entities.Tarjeta;
import entities.Venta;
import facades.FacadeIF;
import java.math.BigDecimal;
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
    public void create(@WebParam(name = "entity") Tarjeta entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Tarjeta entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Tarjeta entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Tarjeta find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Tarjeta> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Tarjeta> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "consultarSaldo")
    public boolean consultarSaldo(Comprador comprador, Venta venta){
        Tarjeta tarjeta = ejbRef.consultarSaldo(comprador.getNumeroTarjeta());
        if (tarjeta == null){
            return false;
        }
        return venta.getValor() <= tarjeta.getSaldo();
    }
    
    
    
}
