
package Integracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsultarFotoHabilitadaResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarFotoHabilitadaResult"
})
@XmlRootElement(name = "ConsultarFotoHabilitadaResponse")
public class ConsultarFotoHabilitadaResponse {

    @XmlElement(name = "ConsultarFotoHabilitadaResult")
    protected Boolean consultarFotoHabilitadaResult;

    /**
     * Obtiene el valor de la propiedad consultarFotoHabilitadaResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsultarFotoHabilitadaResult() {
        return consultarFotoHabilitadaResult;
    }

    /**
     * Define el valor de la propiedad consultarFotoHabilitadaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsultarFotoHabilitadaResult(Boolean value) {
        this.consultarFotoHabilitadaResult = value;
    }

}
