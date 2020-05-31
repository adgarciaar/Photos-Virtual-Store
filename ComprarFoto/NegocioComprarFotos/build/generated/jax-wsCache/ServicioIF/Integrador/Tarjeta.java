
package Integrador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tarjeta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tarjeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numerotarjeta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarjeta", propOrder = {
    "numerotarjeta",
    "saldo"
})
public class Tarjeta {

    protected long numerotarjeta;
    protected long saldo;

    /**
     * Obtiene el valor de la propiedad numerotarjeta.
     * 
     */
    public long getNumerotarjeta() {
        return numerotarjeta;
    }

    /**
     * Define el valor de la propiedad numerotarjeta.
     * 
     */
    public void setNumerotarjeta(long value) {
        this.numerotarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     */
    public long getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     */
    public void setSaldo(long value) {
        this.saldo = value;
    }

}
