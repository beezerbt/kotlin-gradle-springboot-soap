//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.23 at 12:36:04 PM CET 
//


package bc.web.api.api.schema.common.fault.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bc.web.api.api.schema.common.fault.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProximusFaultDetail_QNAME = new QName("http://api.web.bc/api/schema/common/fault/v1", "proximusFaultDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bc.web.api.api.schema.common.fault.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProximusFaultDetailType }
     * 
     */
    public ProximusFaultDetailType createProximusFaultDetailType() {
        return new ProximusFaultDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProximusFaultDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.web.bc/api/schema/common/fault/v1", name = "proximusFaultDetail")
    public JAXBElement<ProximusFaultDetailType> createProximusFaultDetail(ProximusFaultDetailType value) {
        return new JAXBElement<ProximusFaultDetailType>(_ProximusFaultDetail_QNAME, ProximusFaultDetailType.class, null, value);
    }

}
