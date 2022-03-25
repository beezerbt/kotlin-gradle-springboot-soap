package com.example.kambiz.demo.kotlinws

import bc.web.api.capability.business.b010_02.services.billingordering.flv000624.v1.RequestDataSubmitBillingOrderingType
import com.proximus.cloudfusionplus.service.connector.cob.CobClient
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension

@ActiveProfiles("test")
@ExtendWith(SpringExtension::class)
@ContextConfiguration(classes = [MarshallerITonfig::class])
class MarshallerITConfigTest {

    @Autowired
    private val myMarshaller: Jaxb2Marshaller?=null

    @Test
    fun contextLoads() {
        assertNotNull(myMarshaller)
    }

    @Test
    fun givenMarshallerInstance_whenUsingItToInstantiateCobClient_thenCobClientInstantiatedSuccessfully() {
        var cobClient: CobClient
        cobClient = CobClient(myMarshaller!!)
        assertNotNull(cobClient)
    }

    @Test
    fun givenCobClientInstance_whenUsingItToCallBillingOrderMockedPostmanCOBEndpoint_thenItSuccessfullyReturnsThePostmanHardCodedResponse() {
        var cobClient: CobClient
        cobClient = CobClient(myMarshaller!!)
        assertNotNull(cobClient)
        var mockedRequestDataSubmitBillingOrderingType = RequestDataSubmitBillingOrderingType()
        assertNotNull(mockedRequestDataSubmitBillingOrderingType)
        var response = cobClient.doBillingOrderRequest(mockedRequestDataSubmitBillingOrderingType)
        assertNotNull(response)
    }


}