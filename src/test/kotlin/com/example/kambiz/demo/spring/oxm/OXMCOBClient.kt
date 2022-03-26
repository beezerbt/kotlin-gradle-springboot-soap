package com.example.kambiz.demo.spring.oxm

import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderIdentifierType
import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.ResponseDataSubmitBillingOrderingType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.SubmitBillingOrderingServiceDataRequestType
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.ws.client.core.support.WebServiceGatewaySupport
import javax.xml.bind.JAXBElement


class OXMCOBClient : WebServiceGatewaySupport() {
    private val LOG: Log = LogFactory.getLog(WebServiceGatewaySupport::class.java)

    fun getBillingOrder(): Any {
        val requestDataSubmitBillingOrderingType = RequestDataSubmitBillingOrderingType()
        requestDataSubmitBillingOrderingType.serviceData = SubmitBillingOrderingServiceDataRequestType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder = BillingOrderType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier = BillingOrderIdentifierType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier.id = "HCMOR-00000000000772-1"

        val requestResponseWas: Any = webServiceTemplate.marshalSendAndReceive(requestDataSubmitBillingOrderingType)
        if (requestResponseWas is JAXBElement<*>) {
            LOG.info("requestResponseWas Any was of type:JAXBElement<*>")
            when(requestResponseWas.value) {
                is ResponseDataSubmitBillingOrderingType -> {
                    println("responsePartOfElement was of type:ResponseDataSubmitBillingOrderingType")
                    println("" + (requestResponseWas.value as ResponseDataSubmitBillingOrderingType).serviceContext.processData.processId)
                    return requestResponseWas.value
                }
            }
        } else {
            LOG.info("requestResponseWas Any was of --NOT-- of type  type:JAXBElement<*>")
        }
        return requestResponseWas
    }
}
