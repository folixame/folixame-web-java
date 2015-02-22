
package me.folixa.ws.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetProfilesResult" type="{http://folixa.me/}ArrayOfProfile" minOccurs="0"/>
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
    "getProfilesResult"
})
@XmlRootElement(name = "GetProfilesResponse")
public class GetProfilesResponse {

    @XmlElement(name = "GetProfilesResult")
    protected ArrayOfProfile getProfilesResult;

    /**
     * Obtiene el valor de la propiedad getProfilesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfile }
     *     
     */
    public ArrayOfProfile getGetProfilesResult() {
        return getProfilesResult;
    }

    /**
     * Define el valor de la propiedad getProfilesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfile }
     *     
     */
    public void setGetProfilesResult(ArrayOfProfile value) {
        this.getProfilesResult = value;
    }

}
