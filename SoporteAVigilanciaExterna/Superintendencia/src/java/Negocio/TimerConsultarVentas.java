/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Facade.VentaFacade;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

/**
 *
 * @author Administrador
 */
@Stateless
public class TimerConsultarVentas {

    @EJB
    private VentaFacade ventaFacade;

    @Schedule(dayOfWeek = "*", month = "*", hour = "0-23", dayOfMonth = "*", year = "*", minute = "*", second = "20", persistent = false)
    
    public void myTimer() {
        //System.out.println("Timer event: " + new Date());       
        ventaFacade.consultarVentas();
    }
    
    
    
}
