package com.proximus.cloudfusionplus.service.connector.cob

import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.ResponseDataSubmitBillingOrderingType
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import org.springframework.ws.client.core.support.WebServiceGatewaySupport

@Configuration
class CobClientConfig(
    @Value("\${cloudfusion.morpheus.base_url}")
    private val cobBaseUrl: String,
    @Value("\${cloudfusion.cob.username}")
    private val cobApiUserName: String,
    @Value("\${cloudfusion.cob.password}")
    private val cobApiPassword: String,
) {

    @Bean
    fun marshaller(): Jaxb2Marshaller {
        val marshaller = Jaxb2Marshaller()
        marshaller.contextPath = "bc.web.api.capability.business.b010_02.objects.requestsubmitbillingordering.flv000624.v1"
        return marshaller
    }

    @Bean
    fun cobClient(): CobClient {
        val client = cobClient()
        client.defaultUri = "http://localhost:8080/ws"
        client.marshaller = marshaller()
        client.unmarshaller = marshaller()
        return client
    }
}

class CobClient() : WebServiceGatewaySupport() {
    fun doBillingOrderRequest(): ResponseDataSubmitBillingOrderingType {
        val request = RequestDataSubmitBillingOrderingType()
        //TODO::fill out the request
        //request.setName(country)
        println("Requesting a BillingOrderAction as follows: $request")
        val response = webServiceTemplate.marshalSendAndReceive(request)
        return response as ResponseDataSubmitBillingOrderingType
    }
}

