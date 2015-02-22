
package me.folixa.ws.events;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para readEventById complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readEventById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readEventById", propOrder = {
    "eventId"
})
public class ReadEventById {

    protected int eventId;

    /**
     * Obtiene el valor de la propiedad eventId.
     * 
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * Define el valor de la propiedad eventId.
     * 
     */
    public void setEventId(int value) {
        this.eventId = value;
    }

}
