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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}CodeValueType"/>
 *         &lt;element name="description" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}NameType" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}CodeValueType" maxOccurs="200" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}CommentType" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://api.web.bc/capability/business/b010-02/objects/requestsubmitbillingordering/flv000624/v1}TimeIntervalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", propOrder = {
    "code",
    "description",
    "reason",
    "comment",
    "validFor"
})
public class StatusType {

    @XmlElement(required = true)
    protected CodeValueType code;
    protected NameType description;
    protected List<CodeValueType> reason;
    protected List<CommentType> comment;
    protected TimeIntervalType validFor;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValueType }
     *     
     */
    public CodeValueType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValueType }
     *     
     */
    public void setCode(CodeValueType value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setDescription(NameType value) {
        this.description = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeValueType }
     * 
     * 
     */
    public List<CodeValueType> getReason() {
        if (reason == null) {
            reason = new ArrayList<CodeValueType>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setValidFor(TimeIntervalType value) {
        this.validFor = value;
    }

}
