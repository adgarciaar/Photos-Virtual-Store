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
        // GET: DerechosAutor      

        
        public ActionResult Validacion()
        {          
            return View();
        }

        [HttpPost]
        public ActionResult Validacion(Foto foto)
        {
            proxyDerechosAutor.WSDerechosAutorClient proxy = new proxyDerechosAutor.WSDerechosAutorClient();
            Boolean esValida = proxy.ConsultarFotoHabilitada(foto.IdFoto);
            ViewBag.Alejo = "respuesta:  " + esValida;
            return View();
        }

    }
}