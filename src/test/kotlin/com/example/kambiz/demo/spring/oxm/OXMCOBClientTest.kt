package com.example.kambiz.demo.spring.oxm

import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.ResponseDataSubmitBillingOrderingType
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
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
    private val LOG: Log = LogFactory.getLog(OXMCOBClientTest::class.java)
    @Test
    fun givenOxmCobClient_whenConfiguringWithMarshallAndUnmarshaller_thenAllIsGood() {
        LOG.info("Starting to test the client!!!!!!!!!!!!!!!!!!!!!!!!!!!!")


        val oxmCobClient = OXMCOBClient()
        oxmCobClient.defaultUri = "https://327d1fc8-c02e-4b4f-b4af-4d446f365b87.mock.pstmn.io/submitBillingOrder"
        val oXMMarshaller = OXMMarshaller()
        val actualMarshaller = oXMMarshaller.getCastorMarshaller("bc.web.api")
        oxmCobClient.marshaller = actualMarshaller
        oxmCobClient.unmarshaller = actualMarshaller
        val billingOrderResponse = oxmCobClient.getBillingOrder()
        assertNotNull(billingOrderResponse)
        when(billingOrderResponse) {
            is ResponseDataSubmitBillingOrderingType -> {
                println("responsePartOfElement was of type:ResponseDataSubmitBillingOrderingType")
                println("" + billingOrderResponse.serviceContext.processData.processId)
                assertEquals(billingOrderResponse.serviceContext.processData.processId,"123456789012")
            }
            !is ResponseDataSubmitBillingOrderingType -> fail("OXMCOBClient was not of expected ResponseDataSubmitBillingOrderingType!")
        }
    }
}