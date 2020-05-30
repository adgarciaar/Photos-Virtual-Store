
package integration.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findResponse", namespace = "http://integration/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findResponse", namespace = "http://integration/")
public class FindResponse {

    @XmlElement(name = "return", namespace = "")
    private entities.Tarjeta _return;

    /**
     * 
     * @return
     *     returns Tarjeta
     */
    public entities.Tarjeta getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Tarjeta _return) {
        this._return = _return;
    }

}
