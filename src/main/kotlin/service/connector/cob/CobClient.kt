package com.proximus.cloudfusionplus.service.connector.cob

import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.ResponseDataSubmitBillingOrderingType
import org.springframework.oxm.Unmarshaller
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import org.springframework.ws.client.core.support.WebServiceGatewaySupport

/*@Configuration
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
        client.defaultUri = "https://59a5a0e9-b75d-44cb-8ff9-b11c95cc62e0.mock.pstmn.io/submitBillingOrder"
        client.marshaller = marshaller()
        client.unmarshaller = marshaller()
        return client
    }
}*/

open class CobClient(var myMarshaller: Jaxb2Marshaller) : WebServiceGatewaySupport() {
    fun doBillingOrderRequest(request:RequestDataSubmitBillingOrderingType): ResponseDataSubmitBillingOrderingType {
        //TODO::log4J dependency
        println("Requesting a BillingOrderAction as follows: $request")
        webServiceTemplate.marshaller = myMarshaller
       /* webServiceTemplate.unmarshaller = Jaxn*/
        webServiceTemplate.defaultUri="https://59a5a0e9-b75d-44cb-8ff9-b11c95cc62e0.mock.pstmn.io/submitBillingOrder"
        val response = webServiceTemplate.marshalSendAndReceive(request)
        return response as ResponseDataSubmitBillingOrderingType
    }
}

