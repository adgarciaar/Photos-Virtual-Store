using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace WebConsultarVentas
{
    public class VentaController : Controller
    {
        // GET: Venta
        public ActionResult List()
        {
            ServicioVentas.ServicioConsultarVentaClient proxy= new ServicioVentas.ServicioConsultarVentaClient();
            ServicioVentas.fechaVenta fechaVenta = new ServicioVentas.fechaVenta();
            ServicioVentas.venta[] ventas = proxy.findAll(fechaVenta);
            return View(ventas.ToList());
        }
    }
}