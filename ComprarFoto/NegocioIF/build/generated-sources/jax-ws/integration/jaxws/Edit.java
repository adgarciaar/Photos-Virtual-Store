
package integration.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "edit", namespace = "http://integration/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edit", namespace = "http://integration/")
public class Edit {

    @XmlElement(name = "entity", namespace = "")
    private entities.Carts entity;

    /**
     * 
     * @return
     *     returns Carts
     */
    public entities.Carts getEntity() {
        return this.entity;
    }

    /**
     * 
     * @param entity
     *     the value for the entity property
     */
    public void setEntity(entities.Carts entity) {
        this.entity = entity;
    }

}