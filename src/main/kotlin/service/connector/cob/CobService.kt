package com.proximus.cloudfusionplus.service.connector.cob

import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import org.springframework.stereotype.Service

@Service
class CobService(private val cobClient: CobClient) {
    //Generate a request for the COB Billing Order
    private fun generateBillingOrderRequest() : RequestDataSubmitBillingOrderingType {
        return RequestDataSubmitBillingOrderingType()
    }
    fun registerBillingOrder() {
        cobClient.doBillingOrderRequest(generateBillingOrderRequest())
    }
}