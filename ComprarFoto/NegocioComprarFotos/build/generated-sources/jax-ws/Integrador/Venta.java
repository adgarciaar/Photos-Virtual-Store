
package Integrador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para venta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="venta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idfoto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idventa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "venta", propOrder = {
    "fecha",
    "idfoto",
    "idventa",
    "valor"
})
public class Venta {

    protected String fecha;
    protected long idfoto;
    protected long idventa;
    protected int valor;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idfoto.
     * 
     */
    public long getIdfoto() {
        return idfoto;
    }

    /**
     * Define el valor de la propiedad idfoto.
     * 
     */
    public void setIdfoto(long value) {
        this.idfoto = value;
    }

    /**
     * Obtiene el valor de la propiedad idventa.
     * 
     */
    public long getIdventa() {
        return idventa;
    }

    /**
     * Define el valor de la propiedad idventa.
     * 
     */
    public void setIdventa(long value) {
        this.idventa = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public int getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(int value) {
        this.valor = value;
    }

}
