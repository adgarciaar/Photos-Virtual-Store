using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;


namespace SistemaDerechosAutor
{
    // NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "WSDerechosAutor" en el código, en svc y en el archivo de configuración a la vez.
    // NOTA: para iniciar el Cliente de prueba WCF para probar este servicio, seleccione WSDerechosAutor.svc o WSDerechosAutor.svc.cs en el Explorador de soluciones e inicie la depuración.
    public class WSDerechosAutor : IWSDerechosAutor
    {
        public Boolean ConsultarFotoHabilitada(int id)
        {

            using (var contexto = new DerechosAutorEntitiesA())
            {
                DerechosAutor estaHabilitada = contexto.DerechosAutor.FirstOrDefault(da => da.Id == id);
                if (estaHabilitada==null)
                {
                    return false;
                }

                if (estaHabilitada.foto_habilitada)
                    return true;
                else
                    return false;
            }
        }

        public void DoWork()
        {
        }
    }
}
