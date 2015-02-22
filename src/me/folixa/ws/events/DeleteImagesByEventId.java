
package me.folixa.ws.events;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deleteImagesByEventId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deleteImagesByEventId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventsId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteImagesByEventId", propOrder = {
    "eventsId"
})
public class DeleteImagesByEventId {

    protected int eventsId;

    /**
     * Obtiene el valor de la propiedad eventsId.
     * 
     */
    public int getEventsId() {
        return eventsId;
    }

    /**
     * Define el valor de la propiedad eventsId.
     * 
     */
    public void setEventsId(int value) {
        this.eventsId = value;
    }

}
