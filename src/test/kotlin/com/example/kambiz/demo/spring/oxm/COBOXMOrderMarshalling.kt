package com.example.kambiz.demo.spring.oxm

import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderIdentifierType
import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.SubmitBillingOrderingServiceDataRequestType
import com.entity.Book
import java.io.FileOutputStream
import java.io.IOException
import javax.xml.bind.JAXBException
import javax.xml.transform.stream.StreamResult


class COBOXMOrderMarshalling {
    @Throws(JAXBException::class, IOException::class)
    fun marshal() {
        val requestDataSubmitBillingOrderingType = RequestDataSubmitBillingOrderingType()
        requestDataSubmitBillingOrderingType.serviceData = SubmitBillingOrderingServiceDataRequestType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder = BillingOrderType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier = BillingOrderIdentifierType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier.id = "HCMOR-00000000000002-1"
        val oXMMarshaller = OXMMarshaller()
        var fos: FileOutputStream? = null
        try {
            fos = FileOutputStream("C:\\temp\\oxm_cobRequest.xml")
            oXMMarshaller.getCastorMarshaller("bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1")?.marshal(requestDataSubmitBillingOrderingType, StreamResult(fos))
        } finally {
            fos!!.close()
        }
    }
}