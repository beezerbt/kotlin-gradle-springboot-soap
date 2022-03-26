package com.exmaple.kambiz.demo.jaxb

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class JAXBMarshallerTest {

    @Test
    fun marshalBook() {
        val book = BookJAXBMarshaller()
        book.marshal()
        val outputFile = File("C:\\temp\\jaxb_book.xml")
        Assertions.assertTrue(outputFile.exists())
        outputFile.forEachLine { println(it) }
    }

    @Test
    fun marshalCobRequest() {
        val cobMarshaller = COBJAXBBillingOrderMarshaller()
        cobMarshaller.marshalRequest()
        val outputFile = File("C:\\temp\\jaxb_cobRequest.xml")
        Assertions.assertTrue(outputFile.exists())
        outputFile.forEachLine { println(it) }
    }

    @Test
    fun marshalCobResponse() {
        val cobMarshaller = COBJAXBBillingOrderMarshaller()
        cobMarshaller.marshalResponse()
        val outputFile = File("C:\\temp\\jaxb_cobResponse.xml")
        Assertions.assertTrue(outputFile.exists())
        outputFile.forEachLine { println(it) }
    }
}