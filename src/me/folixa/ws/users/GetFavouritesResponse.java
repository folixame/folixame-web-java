
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
 *         &lt;element name="GetFavouritesResult" type="{http://folixa.me/}ArrayOfFavourite" minOccurs="0"/>
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
    "getFavouritesResult"
})
@XmlRootElement(name = "GetFavouritesResponse")
public class GetFavouritesResponse {

    @XmlElement(name = "GetFavouritesResult")
    protected ArrayOfFavourite getFavouritesResult;

    /**
     * Obtiene el valor de la propiedad getFavouritesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFavourite }
     *     
     */
    public ArrayOfFavourite getGetFavouritesResult() {
        return getFavouritesResult;
    }

    /**
     * Define el valor de la propiedad getFavouritesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFavourite }
     *     
     */
    public void setGetFavouritesResult(ArrayOfFavourite value) {
        this.getFavouritesResult = value;
    }

}
