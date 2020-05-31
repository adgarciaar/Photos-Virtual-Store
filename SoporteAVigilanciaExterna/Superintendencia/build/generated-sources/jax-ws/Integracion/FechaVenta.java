
package Integracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fechaVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fechaVenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechaConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fechaVenta", propOrder = {
    "fechaConsulta"
})
public class FechaVenta {

    protected String fechaConsulta;

    /**
     * Obtiene el valor de la propiedad fechaConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaConsulta() {
        return fechaConsulta;
    }

    /**
     * Define el valor de la propiedad fechaConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaConsulta(String value) {
        this.fechaConsulta = value;
    }

}
