//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.23 at 12:36:04 PM CET 
//


package bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RequestDataSubmitBillingOrderingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestDataSubmitBillingOrderingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceContext" type="{http://api.web.bc/capability/business/b010-02/services/billingordering/flv000624/v1}SubmitBillingOrderingServiceContextRequestType"/>
 *         &lt;element name="serviceData" type="{http://api.web.bc/capability/business/b010-02/services/billingordering/flv000624/v1}SubmitBillingOrderingServiceDataRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="BillingOrderRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDataSubmitBillingOrderingType", propOrder = {
    "serviceContext",
    "serviceData"
})
public class RequestDataSubmitBillingOrderingType {

    @XmlElement(required = true)
    protected SubmitBillingOrderingServiceContextRequestType serviceContext;
    @XmlElement(required = true)
    protected SubmitBillingOrderingServiceDataRequestType serviceData;

    /**
     * Gets the value of the serviceContext property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitBillingOrderingServiceContextRequestType }
     *     
     */
    public SubmitBillingOrderingServiceContextRequestType getServiceContext() {
        return serviceContext;
    }

    /**
     * Sets the value of the serviceContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitBillingOrderingServiceContextRequestType }
     *     
     */
    public void setServiceContext(SubmitBillingOrderingServiceContextRequestType value) {
        this.serviceContext = value;
    }

    /**
     * Gets the value of the serviceData property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitBillingOrderingServiceDataRequestType }
     *     
     */
    public SubmitBillingOrderingServiceDataRequestType getServiceData() {
        return serviceData;
    }

    /**
     * Sets the value of the serviceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitBillingOrderingServiceDataRequestType }
     *     
     */
    public void setServiceData(SubmitBillingOrderingServiceDataRequestType value) {
        this.serviceData = value;
    }

}
