package com.exmaple.kambiz.demo.jaxb

import bc.web.api.api.schema.servicecontext.processdata.v1.CodeValueType
import bc.web.api.api.schema.servicecontext.processdata.v1.ProcessDataType
import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderIdentifierType
import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.*
import java.io.File
import java.io.IOException
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBException
import javax.xml.bind.Marshaller

class COBJAXBBillingOrderMarshaller {
    @Throws(JAXBException::class, IOException::class)
    fun marshalRequest() {
        val requestDataSubmitBillingOrderingType = RequestDataSubmitBillingOrderingType()
        requestDataSubmitBillingOrderingType.serviceData = SubmitBillingOrderingServiceDataRequestType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder = BillingOrderType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier = BillingOrderIdentifierType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier.id = "HCMOR-00000000000001-1"
        val context = JAXBContext.newInstance(RequestDataSubmitBillingOrderingType::class.java)
        val mar: Marshaller = context.createMarshaller()
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
        mar.marshal(requestDataSubmitBillingOrderingType, File("C:\\temp\\jaxb_cobRequest.xml"))
    }

    fun marshalResponse() {
        val responseDataSubmitBillingOrderingType = ResponseDataSubmitBillingOrderingType()
        responseDataSubmitBillingOrderingType.serviceContext = SubmitBillingOrderingServiceContextResponseType()
        responseDataSubmitBillingOrderingType.serviceContext.processData = ProcessDataType()
        responseDataSubmitBillingOrderingType.serviceContext.processData.processId = "1234-6789012"
        responseDataSubmitBillingOrderingType.serviceContext.processData.processState = CodeValueType()
        responseDataSubmitBillingOrderingType.serviceContext.processData.processState.codeSystem = "BPL"
        responseDataSubmitBillingOrderingType.serviceContext.processData.processState.value = "ACK"
        responseDataSubmitBillingOrderingType.serviceContext.processData.processCompletionStatus = CodeValueType()
        responseDataSubmitBillingOrderingType.serviceContext.processData.processCompletionStatus.codeSystem = "BPL"
        responseDataSubmitBillingOrderingType.serviceContext.processData.processCompletionStatus.value = "ACK"
        val context = JAXBContext.newInstance(ResponseDataSubmitBillingOrderingType::class.java)
        val mar: Marshaller = context.createMarshaller()
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
        mar.marshal(responseDataSubmitBillingOrderingType, File("C:\\temp\\jaxb_cobResponse.xml"))
    }
}