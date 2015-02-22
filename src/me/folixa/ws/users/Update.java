
package me.folixa.ws.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inputEmail",
    "inputPassword"
})
@XmlRootElement(name = "Update")
public class Update {

    protected String inputEmail;
    protected String inputPassword;

    /**
     * Obtiene el valor de la propiedad inputEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputEmail() {
        return inputEmail;
    }

    /**
     * Define el valor de la propiedad inputEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputEmail(String value) {
        this.inputEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad inputPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputPassword() {
        return inputPassword;
    }

    /**
     * Define el valor de la propiedad inputPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputPassword(String value) {
        this.inputPassword = value;
    }

}
