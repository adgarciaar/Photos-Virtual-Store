
package integration.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findRangeResponse", namespace = "http://integration/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findRangeResponse", namespace = "http://integration/")
public class FindRangeResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.Tarjeta> _return;

    /**
     * 
     * @return
     *     returns List<Tarjeta>
     */
    public List<entities.Tarjeta> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.Tarjeta> _return) {
        this._return = _return;
    }

}
