//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.23 at 12:36:04 PM CET 
//


package bc.web.api.api.schema.commoncontext.consumertransaction.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains common metadata, transaction information from the consumer of the API.
 * 
 * <p>Java class for ConsumerTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateTimeCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerTransactionType", propOrder = {
    "businessTransactionId",
    "dateTimeCreated"
})
public class ConsumerTransactionType {

    @XmlElement(required = true)
    protected String businessTransactionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeCreated;

    /**
     * Gets the value of the businessTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransactionId() {
        return businessTransactionId;
    }

    /**
     * Sets the value of the businessTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransactionId(String value) {
        this.businessTransactionId = value;
    }

    /**
     * Gets the value of the dateTimeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeCreated() {
        return dateTimeCreated;
    }

    /**
     * Sets the value of the dateTimeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeCreated(XMLGregorianCalendar value) {
        this.dateTimeCreated = value;
    }

}
