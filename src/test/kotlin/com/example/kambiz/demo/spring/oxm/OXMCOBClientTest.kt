package com.example.kambiz.demo.spring.oxm

import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.support.AnnotationConfigContextLoader

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(loader = AnnotationConfigContextLoader::class)
@TestPropertySource("/application.properties")
class OXMCOBClientTest {
    @Test
    fun givenOxmCobClient_whenConfiguringWithMarshallAndUnmarshaller_thenAllIsGood() {
        val oxmCobClient = OXMCOBClient()
        oxmCobClient.defaultUri ="https://ee2ff1d6-a5f4-43cb-947d-1dfae4b187ea.mock.pstmn.io/submitBillingOrder"
        val oXMMarshaller = OXMMarshaller()
        val actualMarshaller = oXMMarshaller.getCastorMarshaller("bc.web.api")
        oxmCobClient.marshaller = actualMarshaller
        oxmCobClient.unmarshaller = actualMarshaller
        oxmCobClient.getBillingOrder()
    }
}