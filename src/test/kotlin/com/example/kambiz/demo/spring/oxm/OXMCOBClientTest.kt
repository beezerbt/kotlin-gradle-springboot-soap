package com.example.kambiz.demo.spring.oxm

import org.junit.jupiter.api.Test

class OXMCOBClientTest {
    @Test
    fun givenOxmCobClient_whenConfiguringWithMarshallAndUnmarshaller_thenAllIsGood() {
        val oxmCobClient = OXMCOBClient()
        oxmCobClient.defaultUri ="https://b7e3ece6-e589-4399-9519-7c98a1ffc37b.mock.pstmn.io/submitBillingOrder"
        val oXMMarshaller = OXMMarshaller()
        val actualMarshaller = oXMMarshaller.getCastorMarshaller("bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1")
        oxmCobClient.marshaller = actualMarshaller
        oxmCobClient.unmarshaller = actualMarshaller
        oxmCobClient.getBillingOrder()
    }
}