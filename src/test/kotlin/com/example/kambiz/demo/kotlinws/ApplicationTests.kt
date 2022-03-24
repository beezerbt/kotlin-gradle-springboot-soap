package com.example.kambiz.demo.kotlinws

import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.support.AnnotationConfigContextLoader


@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(loader = AnnotationConfigContextLoader::class)
class ClientLiveTest {
 /*   @Test
    fun givenCobClient_whenInstantiatingTheClient_thenItSuccessfullyInstantiateIt() {
        assertNotNull(client)
        //val response: ResponseDataSubmitBillingOrderingType = client!!.doBillingOrderRequest()
        //assertNotNull(response)
    }

    @Test
    fun givenBillingOrderService_whenBillingOrderActionSucceeded_thenBillingOrderResponseIdIsNoNull() {
        val response: ResponseDataSubmitBillingOrderingType = client!!.doBillingOrderRequest()
        assertEquals("String", response.serviceData.managedEntityDelta.billingOrder.identifier.get(0).id)
    }

    @Test
    fun givenBillingOrderService_whenBillingOrderActionFailed_thenBillingOrderResponseIdIsNull() {
        val response: ResponseDataSubmitBillingOrderingType = client!!.doBillingOrderRequest()
        assertNull(response.serviceData.managedEntityDelta.billingOrder.identifier.get(0).id)
    }*/
}