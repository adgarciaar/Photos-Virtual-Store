
package integration.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "create", namespace = "http://integration/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create", namespace = "http://integration/")
public class Create {

    @XmlElement(name = "entity", namespace = "")
    private entities.Tarjeta entity;

    /**
     * 
     * @return
     *     returns Tarjeta
     */
    public entities.Tarjeta getEntity() {
        return this.entity;
    }

    /**
     * 
     * @param entity
     *     the value for the entity property
     */
    public void setEntity(entities.Tarjeta entity) {
        this.entity = entity;
    }

}
