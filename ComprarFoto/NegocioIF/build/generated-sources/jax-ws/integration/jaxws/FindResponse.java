
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
    private entities.Carts _return;

    /**
     * 
     * @return
     *     returns Carts
     */
    public entities.Carts getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(entities.Carts _return) {
        this._return = _return;
    }

}
