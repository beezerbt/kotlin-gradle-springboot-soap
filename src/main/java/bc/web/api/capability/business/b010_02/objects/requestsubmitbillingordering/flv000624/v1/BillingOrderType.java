//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.23 at 12:36:04 PM CET 
//


package bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillingOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}BillingOrderIdentifierType"/>
 *         &lt;element name="status" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}StatusType" minOccurs="0"/>
 *         &lt;element name="salesChannelIdentifier" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}SalesChannelIdentifierType"/>
 *         &lt;element name="item" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}BillingOrderItemType" maxOccurs="100"/>
 *         &lt;element name="charVal" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}BillingOrderCharValType" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="operationalContext" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}BillingOrderOperationalContextType"/>
 *         &lt;element name="customerOrderIdentifier" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}CustomerOrderIdentifierType"/>
 *         &lt;element name="customerIdentifier" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}CustomerIdentifierType"/>
 *         &lt;element name="relationship" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}BillingOrderRelationshipType" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="geographicAddressIdentifier" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}GeographicAddressIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingOrderType", propOrder = {
    "identifier",
    "status",
    "salesChannelIdentifier",
    "item",
    "charVal",
    "operationalContext",
    "customerOrderIdentifier",
    "customerIdentifier",
    "relationship",
    "dueDate",
    "geographicAddressIdentifier"
})
public class BillingOrderType {

    @XmlElement(required = true)
    protected BillingOrderIdentifierType identifier;
    protected StatusType status;
    @XmlElement(required = true)
    protected SalesChannelIdentifierType salesChannelIdentifier;
    @XmlElement(required = true)
    protected List<BillingOrderItemType> item;
    protected List<BillingOrderCharValType> charVal;
    @XmlElement(required = true)
    protected BillingOrderOperationalContextType operationalContext;
    @XmlElement(required = true)
    protected CustomerOrderIdentifierType customerOrderIdentifier;
    @XmlElement(required = true)
    protected CustomerIdentifierType customerIdentifier;
    protected List<BillingOrderRelationshipType> relationship;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    protected GeographicAddressIdentifierType geographicAddressIdentifier;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link BillingOrderIdentifierType }
     *     
     */
    public BillingOrderIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingOrderIdentifierType }
     *     
     */
    public void setIdentifier(BillingOrderIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the salesChannelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SalesChannelIdentifierType }
     *     
     */
    public SalesChannelIdentifierType getSalesChannelIdentifier() {
        return salesChannelIdentifier;
    }

    /**
     * Sets the value of the salesChannelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesChannelIdentifierType }
     *     
     */
    public void setSalesChannelIdentifier(SalesChannelIdentifierType value) {
        this.salesChannelIdentifier = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingOrderItemType }
     * 
     * 
     */
    public List<BillingOrderItemType> getItem() {
        if (item == null) {
            item = new ArrayList<BillingOrderItemType>();
        }
        return this.item;
    }

    /**
     * Gets the value of the charVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingOrderCharValType }
     * 
     * 
     */
    public List<BillingOrderCharValType> getCharVal() {
        if (charVal == null) {
            charVal = new ArrayList<BillingOrderCharValType>();
        }
        return this.charVal;
    }

    /**
     * Gets the value of the operationalContext property.
     * 
     * @return
     *     possible object is
     *     {@link BillingOrderOperationalContextType }
     *     
     */
    public BillingOrderOperationalContextType getOperationalContext() {
        return operationalContext;
    }

    /**
     * Sets the value of the operationalContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingOrderOperationalContextType }
     *     
     */
    public void setOperationalContext(BillingOrderOperationalContextType value) {
        this.operationalContext = value;
    }

    /**
     * Gets the value of the customerOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderIdentifierType }
     *     
     */
    public CustomerOrderIdentifierType getCustomerOrderIdentifier() {
        return customerOrderIdentifier;
    }

    /**
     * Sets the value of the customerOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderIdentifierType }
     *     
     */
    public void setCustomerOrderIdentifier(CustomerOrderIdentifierType value) {
        this.customerOrderIdentifier = value;
    }

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentifierType }
     *     
     */
    public CustomerIdentifierType getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentifierType }
     *     
     */
    public void setCustomerIdentifier(CustomerIdentifierType value) {
        this.customerIdentifier = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingOrderRelationshipType }
     * 
     * 
     */
    public List<BillingOrderRelationshipType> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<BillingOrderRelationshipType>();
        }
        return this.relationship;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the geographicAddressIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddressIdentifierType }
     *     
     */
    public GeographicAddressIdentifierType getGeographicAddressIdentifier() {
        return geographicAddressIdentifier;
    }

    /**
     * Sets the value of the geographicAddressIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddressIdentifierType }
     *     
     */
    public void setGeographicAddressIdentifier(GeographicAddressIdentifierType value) {
        this.geographicAddressIdentifier = value;
    }

}
