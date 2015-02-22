
package me.folixa.ws.events;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para readEventsByCategory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readEventsByCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readEventsByCategory", propOrder = {
    "categoryId"
})
public class ReadEventsByCategory {

    protected int categoryId;

    /**
     * Obtiene el valor de la propiedad categoryId.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Define el valor de la propiedad categoryId.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
    }

}
