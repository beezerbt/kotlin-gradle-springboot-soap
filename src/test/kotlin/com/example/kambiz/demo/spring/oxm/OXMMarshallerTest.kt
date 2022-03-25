package com.example.kambiz.demo.spring.oxm

import com.exmaple.kambiz.demo.jaxb.BookJAXBMarshaller
import com.exmaple.kambiz.demo.jaxb.COBJAXBBillingOrderMarshaller
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class OXMMarshallerTest {
    @Test
    fun givenBookOXMMarshaller_wheWeCreateOne_thenItIsSuccessful() {
        val oXMMarshaller = OXMMarshaller()
        Assertions.assertNotNull(oXMMarshaller.getCastorMarshaller("com.entity"))
    }

    @Test
    fun marshalBook() {
        val bookOXMMarshalling = BookOXMMarshalling()
        bookOXMMarshalling.marshal()
        val outputFile = File("C:\\temp\\oxm_book.xml")
        Assertions.assertTrue(outputFile.exists())
        outputFile.forEachLine { println(it) }
    }

    @Test
    fun marshalCobRequest() {
        val cobMarshaller = COBOXMOrderMarshalling()
        cobMarshaller.marshal()
        val outputFile = File("C:\\temp\\oxm_cobRequest.xml")
        Assertions.assertTrue(outputFile.exists())
        outputFile.forEachLine { println(it) }
    }

}