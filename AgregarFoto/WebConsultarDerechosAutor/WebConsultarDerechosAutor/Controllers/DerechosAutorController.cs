using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using WebConsultarDerechosAutor.Models;

namespace WebConsultarDerechosAutor
{
    public class DerechosAutorController : Controller
    {   
        public ActionResult Validacion()
        {  
            return View();
        }

        [HttpPost]
        public ActionResult Validacion(Foto model)
        {
            if (!ModelState.IsValid)
            {
                return View(model);
            }
            proxyDerechosAutor.WSDerechosAutorClient proxy = new proxyDerechosAutor.WSDerechosAutorClient();
            Boolean esValida = proxy.ConsultarFotoHabilitada(model.IdFoto);
            ViewBag.Message = " respuesta:  " + esValida;
            return View("Respuesta");

        }

        public ActionResult Respuesta()
        {
            return View();
        }

        }
}