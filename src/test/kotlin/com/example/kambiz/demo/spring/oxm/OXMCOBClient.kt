package com.example.kambiz.demo.spring.oxm

import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderIdentifierType
import bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1.BillingOrderType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.ResponseDataSubmitBillingOrderingType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.SubmitBillingOrderingServiceDataRequestType
import org.springframework.ws.client.core.support.WebServiceGatewaySupport


class OXMCOBClient: WebServiceGatewaySupport() {
    fun getBillingOrder(): ResponseDataSubmitBillingOrderingType? {
        val requestDataSubmitBillingOrderingType = RequestDataSubmitBillingOrderingType()
        requestDataSubmitBillingOrderingType.serviceData = SubmitBillingOrderingServiceDataRequestType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder = BillingOrderType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier = BillingOrderIdentifierType()
        requestDataSubmitBillingOrderingType.serviceData.billingOrder.identifier.id = "HCMOR-00000000000002-1"
        return webServiceTemplate
            .marshalSendAndReceive(requestDataSubmitBillingOrderingType) as ResponseDataSubmitBillingOrderingType
    }
}
