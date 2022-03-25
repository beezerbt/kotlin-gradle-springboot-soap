package com.exmaple.kambiz.demo.jaxb

import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderIdentifierType
import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.SubmitBillingOrderingServiceDataRequestType
import java.io.File
import java.io.IOException
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBException
import javax.xml.bind.Marshaller

class COBJAXBBillingOrderMarshaller {
    @Throws(JAXBException::class, IOException::class)
    fun marshal() {
        val requestDataSubmitBillingOrderingType = RequestDataSubmitBillingOrderingType()
        requestDataSubmitBillingOrderingType.serviceData = SubmitBillingOrderingServiceDataRequestType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder = BillingOrderType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier = BillingOrderIdentifierType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier.id = "HCMOR-00000000000001-1"
        val context = JAXBContext.newInstance(RequestDataSubmitBillingOrderingType::class.java)
        val mar: Marshaller = context.createMarshaller()
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
        mar.marshal(requestDataSubmitBillingOrderingType, File("C:\\temp\\cobRequest.xml"))
    }
}