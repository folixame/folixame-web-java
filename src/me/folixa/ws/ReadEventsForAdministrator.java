
package me.folixa.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para readEventsForAdministrator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readEventsForAdministrator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readEventsForAdministrator", propOrder = {
    "validated"
})
public class ReadEventsForAdministrator {

    protected int validated;

    /**
     * Obtiene el valor de la propiedad validated.
     * 
     */
    public int getValidated() {
        return validated;
    }

    /**
     * Define el valor de la propiedad validated.
     * 
     */
    public void setValidated(int value) {
        this.validated = value;
    }

}
